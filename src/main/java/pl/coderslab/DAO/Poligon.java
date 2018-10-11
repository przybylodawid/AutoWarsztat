package pl.coderslab.DAO;

import pl.coderslab.models.Task;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet(name = "Poligon", urlPatterns = "/poligon")
public class Poligon extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");

        response.getWriter().append("HELLO <br><br>");

//        try {
//
//            Date data1 = Date.valueOf("2018-02-02");
//            Date data2 = Date.valueOf("2018-02-03");
//
////            TEST DODANIA - działa
////            TaskDAO testtask = new TaskDAO();
////            testtask.setDescription("Test1");
////            testtask.setCar_id(1);
////            testtask.setEmployee_id(1);
////            testtask.setStart_date(data2);
////            testtask.saveToDB();
//
////              TEST BY ID - działa
////            TaskDAO testtask = TaskDAO.loadTaskById(1);
////            response.getWriter().append(testtask.toString());
//
////            TEST view ALL: - działa
////            ArrayList<TaskDAO> tasks = TaskDAO.loadAllTasks();
////            for (TaskDAO task:tasks){
////                response.getWriter().append(task.toString() + "<br>");
////            }
//
////            TEST view ALL by CAR ID: - działa
////            ArrayList<TaskDAO> tasks = TaskDAO.loadAllTasksByCarId(3);
////            for (TaskDAO task:tasks){
////                response.getWriter().append(task.toString() + "<br>");
////            }
//
////            TEST view ALL by EMPLOYEE ID: - działa
////            ArrayList<TaskDAO> tasks = TaskDAO.loadAllTasksByEmployeeId(2);
////            for (TaskDAO task:tasks){
////                response.getWriter().append(task.toString() + "<br>");
////            }
//
//            //            TEST view ALL by Status ID: - działa
////            ArrayList<TaskDAO> tasks = TaskDAO.loadAllTasksByStatus(1);
////            for (TaskDAO task:tasks){
////                response.getWriter().append(task.toString() + "<br>");
////            }
//
////                        TEST delete by ID: - działa
////            TaskDAO task = TaskDAO.loadTaskById(1);
////            task.deleteTask();
//
//            //                        TEST EDIT by ID: - działa
////            TaskDAO task = TaskDAO.loadTaskById(2);
////            response.getWriter().append(task.toString()+"<br>");
////            task.setResult("Poszlo na zlom");
////            task.setEmployee_id(3);
////            task.setHours(50);
////            response.getWriter().append(task.toString()+"<br>");
////            task.saveToDB();
//
//
//
//
//
//        }catch(SQLException o){
//            System.out.println(" --------- ERROR -------------");
//            response.getWriter().append(" --------- ERROR -------------");
//            o.printStackTrace();
//        }
//}
//
    }
}
