package pl.coderslab.controller;

import pl.coderslab.DAO.TaskDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet(name = "TaskByEmployee", urlPatterns = "/taskbyemployee")
public class TaskByEmployee extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");

        try {
            String String_employee_id = request.getParameter("employee_id");
            int employee_id = Integer.parseInt(String_employee_id);

            ArrayList<TaskDAO> tasks = TaskDAO.loadAllTasksByEmployeeId(employee_id);
            request.setAttribute("tasks", tasks);
            getServletContext().getRequestDispatcher("/WEB-INF/views/taskviewall.jsp").forward(request, response);

        }catch (SQLException o){
            o.printStackTrace();
        }catch (NumberFormatException e){
            e.printStackTrace();
            response.getWriter().append("ZLY FORMAT DANYCH");
        }

    }
}
