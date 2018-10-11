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

@WebServlet(name = "TaskEdit", urlPatterns = "/taskedit")
public class TaskEdit extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        try {
            TaskDAO task = new TaskDAO();
            task.setId(Integer.parseInt(request.getParameter("id")));
            task.setCheck_in_date(Date.valueOf(request.getParameter("check_in_date")));
            task.setStart_date(Date.valueOf(request.getParameter("start_date")));
            task.setEnd_date(Date.valueOf(request.getParameter("end_date")));
            task.setEmployee_id(Integer.parseInt(request.getParameter("employee_id")));
            task.setDescription(request.getParameter("description"));
            task.setResult(request.getParameter("result"));
            task.setStatus_id(Integer.parseInt(request.getParameter("status_id")));
            task.setCar_id(Integer.parseInt(request.getParameter("car_id")));
            task.setTotal_price(Double.parseDouble(request.getParameter("total_price")));
            task.setPart_cost(Double.parseDouble(request.getParameter("part_cost")));
            task.setHours(Integer.parseInt(request.getParameter("hours")));
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

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");

        String StringId = request.getParameter("task_id");
        try{
            int id = Integer.parseInt(StringId);
            TaskDAO task = TaskDAO.loadTaskById(id);
            request.setAttribute("task", task);
            getServletContext().getRequestDispatcher("/WEB-INF/forms/taskedit.jsp").forward(request, response);



        }catch (NumberFormatException o){
            response.getWriter().append("BŁĄD PARAMETRU ID");

        }catch (SQLException o){
            o.printStackTrace();
        }
    }
}
