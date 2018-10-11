package pl.coderslab.controller;

import pl.coderslab.DAO.EmployeeDao;
import pl.coderslab.models.Employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeViewAll", urlPatterns = "/employeeviewall")
public class EmployeeViewAll extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EmployeeDao employeeDao= EmployeeDao.getInstance();
        List<Employee> cList = employeeDao.getAllEmployees();
        request.setAttribute("employees", cList);

        request.getRequestDispatcher("/WEB-INF/views/EmployeeViewAll.jsp").forward(request, response);
    }
}