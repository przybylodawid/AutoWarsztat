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

@WebServlet(name = "TaskByCar", urlPatterns = "/taskbycar")
public class TaskByCar extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");

        try {
            String String_car_id = request.getParameter("car_id");
            int car_id = Integer.parseInt(String_car_id);

            ArrayList<TaskDAO> tasks = TaskDAO.loadAllTasksByCarId(car_id);
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
