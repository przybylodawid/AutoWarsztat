package pl.coderslab.controller;

import pl.coderslab.utils.DAO.CustomerDAO;
import pl.coderslab.utils.models.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet(name = "CustomerViewAll", urlPatterns = "/customerviewall")
public class CustomerViewAll extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        try {
            ArrayList<CustomerDAO> customers = CustomerDAO.loadAllCustomers();
            request.setAttribute("customers", customers);
            getServletContext().getRequestDispatcher("/WEB-INF/views/customerviewall.jsp").forward(request,response);


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
