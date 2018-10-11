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

@WebServlet(name = "TaskViewAll", urlPatterns = "/taskviewall")
public class Taskviewall extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            ArrayList<TaskDAO> tasks = TaskDAO.loadAllTasks();
            request.setAttribute("tasks", tasks);
            getServletContext().getRequestDispatcher("/WEB-INF/views/taskviewall.jsp").forward(request, response);

        }catch (SQLException o){
            o.printStackTrace();
        }
    }
}
