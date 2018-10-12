<%--
  Created by IntelliJ IDEA.
  User: janusz
  Date: 09.10.18
  Time: 22:23
  To change this template use File | Settings | File Templates.
--%>

<%--<%@ page language="java" contentType="text/html; charset=UTF-8"--%>
<%--pageEncoding="UTF-8"%>--%>

<%@ page import="java.util.ArrayList"%>

<%@ page import="pl.coderslab.models.Employee"%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<html>
<head>
    <title>Employees</title>
       <%@include file="/WEB-INF/fragments/header.jsp" %>
</head>
<body>


<%@include file="/WEB-INF/fragments/menu.jsp"%>


<br><br>

<table class="table table-striped table-bordered table-hover" id="carsviewall">
    <tr>
        <th>id</th>
        <th>Name</th>
        <th>Lastname</th>
        <th>Address</th>
        <th>Phone</th>
        <th>Note</th>
        <th>PP hour</th>
        <th>Action</th>
    </tr>
    <%
        ArrayList<Employee> employees = (ArrayList<Employee>) request.getAttribute("employees");
        if (employees != null) {
            for (Employee employee : employees) {
                String currName = employee.getName();
                String currLastname = employee.getLastname();
                String currAddress = employee.getAddress();
                String currPhone = employee.getPhone();
                String currNote = employee.getNote();
                Double currPph = employee.getPph();
                int currId = employee.getId();
    %>

    <tr>
        <td><%=currId%></td>
        <td><%=currName%></td>
        <td><%=currLastname%></td>
        <td><%=currAddress%></td>
        <td><%=currPhone%></td>
        <td><%=currNote%></td>
        <td><%=currPph%></td>
        <td>
            <a href="employeeviewone?id=<%=currId%>">select</a>
        </td>
    </tr>

    <%
            }
        }
    %>

</table>

<jsp:include page="/WEB-INF/fragments/footer.jsp"/>

</body>
</html>