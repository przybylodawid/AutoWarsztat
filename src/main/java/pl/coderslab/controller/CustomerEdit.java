package pl.coderslab.controller;

import pl.coderslab.utils.DAO.CustomerDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;

@WebServlet(name = "CustomerEdit", urlPatterns = "/customeredit")
public class CustomerEdit extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");

        String idString = request.getParameter("id");
        int id = Integer.parseInt(idString);

        String name = request.getParameter("name");
        String lastname = request.getParameter("lastname");
        Date bdate = Date.valueOf(request.getParameter("bdate"));

        CustomerDAO customer = new CustomerDAO();
        customer.setId(id);
        customer.setName(name);
        customer.setLastname(lastname);
        customer.setBdate(bdate);

        try {
            customer.saveToDB();
            response.getWriter().append("dane klienta zostały zmienione");

        } catch (SQLException e) {

            e.printStackTrace();
            response.getWriter().append("nie udało się zmienić danych");
        }
//        response.sendRedirect("customerviewall");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String idString = request.getParameter("customer_id");
        int id = Integer.parseInt(idString);



        try {
            CustomerDAO customer = CustomerDAO.loadCustomersById(id);
            request.setAttribute("customer", customer);
            getServletContext().getRequestDispatcher("/WEB-INF/forms/customeredit.jsp").forward(request,response);


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
