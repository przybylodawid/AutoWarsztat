package pl.coderslab.controller;

import pl.coderslab.DAO.EmployeeDao;
import pl.coderslab.models.Employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "EmployeeEdit", urlPatterns = "/employeeedit")
public class EmployeeEdit extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.valueOf(request.getParameter("id"));
        String name = request.getParameter("name");
        String surname = request.getParameter("lastname");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        String note = request.getParameter("note");
        Double pph = Double.valueOf(request.getParameter("pph"));


        EmployeeDao employeeDao = EmployeeDao.getInstance();

        Employee employee = new Employee(id, name, surname, address, phone, note, pph);
        if (employeeDao.update(employee)) {
            request.setAttribute("employeeDao", employeeDao);

            response.sendRedirect("employeeviewall");
        } else {
            response.sendRedirect("employeeedit");



        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        EmployeeDao employeeDao = EmployeeDao.getInstance();

        int id = Integer.valueOf(request.getParameter("id"));

        Employee employee =employeeDao.getEmployeeById(id);

        request.setAttribute("employee", employee);

        request.getRequestDispatcher("/WEB-INF/forms/EmployeeEdit.jsp").forward(request, response);
    }
}