package pl.coderslab.controller;

import pl.coderslab.DAO.TaskDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;

@WebServlet(name = "TaskAddNew", urlPatterns = "/taskaddnew")
public class TaskAddNew extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        try {
            TaskDAO task = new TaskDAO();
            task.setStart_date(Date.valueOf(request.getParameter("start_date")));
            task.setEmployee_id(Integer.parseInt(request.getParameter("employee_id")));
            task.setDescription(request.getParameter("description"));
            task.setCar_id(Integer.parseInt(request.getParameter("car_id")));
            task.saveToDB();
        }catch(NumberFormatException o ){
            response.getWriter().append("Zły format parametrów");
            o.printStackTrace();
        }catch (SQLException o){
            response.getWriter().append("Błąd SQL");
            o.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/WEB-INF/forms/taskaddnew.jsp").forward(request, response);

    }
}
