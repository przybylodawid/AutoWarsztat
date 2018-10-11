package pl.coderslab.controller;

import pl.coderslab.DAO.EmployeeDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "EmployeeDelete", urlPatterns = "/employeedelete")
public class EmployeeDelete extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.valueOf(request.getParameter("id"));
        EmployeeDao employeeDao = EmployeeDao.getInstance();

        if (employeeDao.delete(id)) {
            request.setAttribute("employeeDao", employeeDao);

            response.sendRedirect("employeeviewall");
        } else {
            response.sendRedirect("Error");

        }

    }
}