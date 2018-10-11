package pl.coderslab.DAO;

import pl.coderslab.utils.DbUtil;
import pl.coderslab.models.Customer;
import java.sql.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;


public class CustomerDAO extends Customer {



    public void saveToDB() throws SQLException {

        try {
            Connection connection = DbUtil.getConn();
            if (this.getId() == 0) {
                String sql = "insert into customers(name, lastname, bdate) values(?, ?, ?)";
                String generatedColumns[] = {"id"};
                PreparedStatement preparedStatement = connection.prepareStatement(sql, generatedColumns);
                preparedStatement.setString(1, this.getName());
                preparedStatement.setString(2, this.getLastname());
                preparedStatement.setDate(3, this.getBdate());
                preparedStatement.executeUpdate();
                ResultSet resultSet = preparedStatement.getGeneratedKeys();
                if (resultSet.next()) {
                    this.setId(resultSet.getInt(1));
                }
            } else {
                String sql = "update customers set name=?, lastname=?, bdate=? where id=?";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, this.getName());
                preparedStatement.setString(2, this.getLastname());
                preparedStatement.setDate(3, this.getBdate());
                preparedStatement.setInt(4, this.getId());
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


    public static CustomerDAO loadCustomersById(int id) throws SQLException {



        try {
            Connection connection = DbUtil.getConn();
            String sql = "select * from customers where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            return getCustomerData(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;


    }

    public static CustomerDAO loadCustomersByLastname(String lastname) throws SQLException {



        try {
            Connection connection = DbUtil.getConn();
            String sql = "select * from customers where lastname = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, lastname);
            ResultSet resultSet = preparedStatement.executeQuery();
            return getCustomerData(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;


    }

    private static CustomerDAO getCustomerData(ResultSet resultSet) throws SQLException {
        if (resultSet.next()) {
            CustomerDAO loadedCustomer = new CustomerDAO();
            loadedCustomer.setId(resultSet.getInt("id"));
            loadedCustomer.setName(resultSet.getString("name"));
            loadedCustomer.setLastname(resultSet.getString("lastname"));
            loadedCustomer.setBdate(resultSet.getDate("bdate"));

            return loadedCustomer;
        } else {
            return null;
        }
    }


    public static ArrayList<CustomerDAO> loadAllCustomers() throws SQLException {

        try {
            Connection connection = DbUtil.getConn();
            ArrayList<CustomerDAO> customerDAOList = new ArrayList<>();
            String sql = "SELECT * FROM customers";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            getCustomernData(customerDAOList, resultSet);
            return customerDAOList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    private static void getCustomernData(ArrayList<CustomerDAO> customers, ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {
            CustomerDAO loadedCustomer = new CustomerDAO();
            loadedCustomer.setId(resultSet.getInt("id"));
            loadedCustomer.setName(resultSet.getString("name"));
            loadedCustomer.setLastname(resultSet.getString("lastname"));
            loadedCustomer.setBdate(resultSet.getDate("bdate"));

            customers.add(loadedCustomer);
        }
    }


    public void deleteCustomer() {

        try {
            Connection connection = DbUtil.getConn();
            if (this.getId() != 0) {
                String sql = "delete from customers where id=?";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, this.getId());
                preparedStatement.executeUpdate();
                this.setId(0);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
