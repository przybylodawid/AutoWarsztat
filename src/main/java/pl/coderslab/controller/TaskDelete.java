package pl.coderslab.controller;

import pl.coderslab.DAO.TaskDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.regex.Pattern;

@WebServlet(name = "TaskDelete", urlPatterns = "/taskdelete")
public class TaskDelete extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");

        String StringId = request.getParameter("task_id");
        try{
            int id = Integer.parseInt(StringId);
            TaskDAO task = TaskDAO.loadTaskById(id);
            task.deleteTask();


        }catch (NumberFormatException o){
            response.getWriter().append("BŁĄD PARAMETRU ID");

        }catch (SQLException o){
            o.printStackTrace();
        }}
}
