package pl.coderslab.controller;

import pl.coderslab.DAO.EmployeeDao;
import pl.coderslab.models.Employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "EmployeeViewOne", urlPatterns = "/employeeviewone")
public class EmployeeViewOne extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        EmployeeDao employeeDao = EmployeeDao.getInstance();
        Employee employee = new Employee();
        int id = Integer.valueOf(request.getParameter("id"));

        employee =employeeDao.getEmployeeById(id);

        request.setAttribute("employee", employee);

        request.getRequestDispatcher("/WEB-INF/views/EmployeeViewOne.jsp").forward(request, response);


    }
}