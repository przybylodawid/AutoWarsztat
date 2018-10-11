package pl.coderslab.DAO;

import pl.coderslab.models.Task;
import pl.coderslab.utils.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TaskDAO extends Task {
    public static final String updateDbQuerry = "UPDATE tasks SET start_date = ?,  end_date = ? , employee_id = ?, description = ?, result = ?, status_id = ?, car_id = ?, total_price = ?, part_cost = ?, hours = ? WHERE id= ?;";
    public static final String saveToDbQuerry = "INSERT INTO tasks (check_in_date, start_date,  employee_id, description, status_id, car_id) VALUES\n" +
            "(CURDATE(), ?, ?, ?, 1, ?)";

    public void saveToDB() throws SQLException {

        try {
            Connection connection = DbUtil.getConn();
            if (this.getId() == 0) {
                String generatedColumns[] = {"id"};
                PreparedStatement preparedStatement = connection.prepareStatement(saveToDbQuerry, generatedColumns);
                preparedStatement.setDate(1, this.getStart_date());
                preparedStatement.setInt(2, this.getEmployee_id());
                preparedStatement.setString(3, this.getDescription());
                preparedStatement.setInt(4, this.getCar_id());
                preparedStatement.executeUpdate();
                ResultSet resultSet = preparedStatement.getGeneratedKeys();
                if (resultSet.next()) {
                    this.setId(resultSet.getInt(1));
                }
            } else {

                PreparedStatement preparedStatement = connection.prepareStatement(updateDbQuerry);
                preparedStatement.setDate(1, this.getStart_date());
                preparedStatement.setDate(2, this.getEnd_date());
                preparedStatement.setInt(3, this.getEmployee_id());
                preparedStatement.setString(4, this.getDescription());
                preparedStatement.setString(5, this.getResult());
                preparedStatement.setInt(6, this.getStatus_id());
                preparedStatement.setInt(7, this.getCar_id());
                preparedStatement.setDouble(8, this.getTotal_price());
                preparedStatement.setDouble(9, this.getPart_cost());
                preparedStatement.setInt(10, this.getHours());
                preparedStatement.setInt(11, this.getId());
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    // METODA DLA 1 OBIEKTU
    private static TaskDAO getFromResultSet(ResultSet resultSet) throws SQLException {

        if (resultSet.next()) {

            TaskDAO taskFromDB = new TaskDAO();
            taskFromDB.setId(resultSet.getInt("id"));
            taskFromDB.setCheck_in_date(resultSet.getDate("check_in_date"));
            taskFromDB.setStart_date(resultSet.getDate("start_date"));
            taskFromDB.setEnd_date(resultSet.getDate("end_date"));
            taskFromDB.setEmployee_id(resultSet.getInt("employee_id"));
            taskFromDB.setDescription(resultSet.getString("description"));
            taskFromDB.setResult(resultSet.getString("result"));
            taskFromDB.setStatus_id(resultSet.getInt("status_id"));
            taskFromDB.setCar_id(resultSet.getInt("car_id"));
            taskFromDB.setTotal_price(resultSet.getDouble("total_price"));
            taskFromDB.setPart_cost(resultSet.getDouble("part_cost"));
            taskFromDB.setHours(resultSet.getInt("hours"));
            return taskFromDB;
        } else {

            return null;
        }

    }

    // METODA DLA LISTY OBIEKTÓW
    public static void getFromResultSet(ResultSet resultSet, ArrayList<TaskDAO> tasks) throws SQLException {

        while (resultSet.next()) {

            TaskDAO taskFromDB = new TaskDAO();
            taskFromDB.setId(resultSet.getInt("id"));
            taskFromDB.setCheck_in_date(resultSet.getDate("check_in_date"));
            taskFromDB.setStart_date(resultSet.getDate("start_date"));
            taskFromDB.setEnd_date(resultSet.getDate("end_date"));
            taskFromDB.setEmployee_id(resultSet.getInt("employee_id"));
            taskFromDB.setDescription(resultSet.getString("description"));
            taskFromDB.setResult(resultSet.getString("result"));
            taskFromDB.setStatus_id(resultSet.getInt("status_id"));
            taskFromDB.setCar_id(resultSet.getInt("car_id"));
            taskFromDB.setTotal_price(resultSet.getDouble("total_price"));
            taskFromDB.setPart_cost(resultSet.getDouble("part_cost"));
            taskFromDB.setHours(resultSet.getInt("hours"));
            tasks.add(taskFromDB);
        }

    }

    public static final String loadTaskByIdQuery = "Select * FROM tasks WHERE id = ?";
    public static TaskDAO loadTaskById(int id) throws SQLException {
        try {
            Connection connection = DbUtil.getConn();
            PreparedStatement preparedStatement = connection.prepareStatement(loadTaskByIdQuery);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            return getFromResultSet(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    public static final String loadAllTasksQuerry = "Select * FROM tasks";
    public static ArrayList<TaskDAO> loadAllTasks() throws SQLException {
        try {
            ArrayList<TaskDAO> tasks = new ArrayList<>();
            Connection connection = DbUtil.getConn();
            PreparedStatement preparedStatement = connection.prepareStatement(loadAllTasksQuerry);
            ResultSet resultSet = preparedStatement.executeQuery();
            getFromResultSet(resultSet, tasks);
            return tasks;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static final String loadAllByCarIdQuery = "Select * FROM tasks WHERE car_id = ?";
    public static ArrayList<TaskDAO> loadAllTasksByCarId(int car_id) throws SQLException {
        try {
            Connection connection = DbUtil.getConn();
            ArrayList<TaskDAO> tasks = new ArrayList<>();
            PreparedStatement preparedStatement = connection.prepareStatement(loadAllByCarIdQuery);
            preparedStatement.setInt(1, car_id);
            ResultSet resultSet = preparedStatement.executeQuery();
            getFromResultSet(resultSet, tasks);
            return tasks;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;


    }

    public static final String loadAllTasksbyEmployeeIdQuery = "Select * FROM tasks WHERE employee_id = ?";

    public static ArrayList<TaskDAO> loadAllTasksByEmployeeId(int employee_id) throws SQLException {

        try {
            Connection connection = DbUtil.getConn();
            ArrayList<TaskDAO> tasks = new ArrayList<>();
            PreparedStatement preparedStatement = connection.prepareStatement(loadAllTasksbyEmployeeIdQuery);
            preparedStatement.setInt(1, employee_id);
            ResultSet resultSet = preparedStatement.executeQuery();
            getFromResultSet(resultSet, tasks);
            return tasks;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static final String loadAllTasksByStatusQuery = "Select * FROM tasks WHERE status_id = ?";
    public static ArrayList<TaskDAO> loadAllTasksByStatus(int status) throws SQLException {

        try {
            Connection connection = DbUtil.getConn();
            ArrayList<TaskDAO> tasks = new ArrayList<>();
            PreparedStatement preparedStatement = connection.prepareStatement(loadAllTasksByStatusQuery);
            preparedStatement.setInt(1, status);
            ResultSet resultSet = preparedStatement.executeQuery();
            getFromResultSet(resultSet, tasks);
            return tasks;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;


    }


    public static final String deleteByIdQuerry = "DELETE FROM tasks WHERE id=?";

    public void deleteTask() throws SQLException {
        try {
            Connection connection = DbUtil.getConn();
            if (this.getId() != 0) {
                PreparedStatement preparedStatement = connection.prepareStatement(deleteByIdQuerry);
                preparedStatement.setInt(1, this.getId());
                preparedStatement.executeUpdate();
                this.setId(0);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
