package pl.coderslab.controller;

import pl.coderslab.DAO.CustomerDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet(name = "CustomerViewOne", urlPatterns = "/customerviewone")
public class CustomerViewOne extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String idString = request.getParameter("id");
        int id = Integer.parseInt(idString);



        try {

            CustomerDAO customer = CustomerDAO.loadCustomersById(id);
            if (customer != null) {
                request.setAttribute("customer", customer);
                getServletContext().getRequestDispatcher("/WEB-INF/views/customerviewone.jsp").forward(request, response);
            } else {
                response.getWriter().append("klient nie istnieje");
        }


        } catch (SQLException e) {
            e.printStackTrace();
        }



    }
}
