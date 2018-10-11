package pl.coderslab.controller;

import pl.coderslab.utils.DAO.CustomerDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "CustomerDelete", urlPatterns = "/customerdelete")
public class CustomerDelete extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {





    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");


        String idString = request.getParameter("customer_id");
        int id = Integer.parseInt(idString);


        try {

            CustomerDAO customer = CustomerDAO.loadCustomersById(id);

            if (customer != null) {
                customer.deleteCustomer();
                response.getWriter().append("klient usunięty");
            } else {
                response.getWriter().append("klient nie istnieje");
            }

        } catch (SQLException e) {
            response.getWriter().append("nie udało się usunąć");
            e.printStackTrace();
        }
    }
}
