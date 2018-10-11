package pl.coderslab.controller;

import pl.coderslab.DAO.CustomerDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;

@WebServlet(name = "CustomerAddNew", urlPatterns = "/customeraddnew")
public class CustomerAddNew extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");

        String name = request.getParameter("name");
        String lastname = request.getParameter("lastname");
        Date bdate = Date.valueOf(request.getParameter("bdate"));

        CustomerDAO customer = new CustomerDAO();
        customer.setName(name);
        customer.setLastname(lastname);
        customer.setBdate(bdate);

        try {
            customer.saveToDB();
            response.getWriter().append("klient dodany");
            response.sendRedirect("customerviewall");

        } catch (SQLException e) {

            e.printStackTrace();
            response.getWriter().append("nie udało się dodać");
        }



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/WEB-INF/forms/customeraddnew.jsp").forward(request, response);
    }
}
