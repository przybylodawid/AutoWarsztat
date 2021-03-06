<%@ page import="pl.coderslab.models.Employee"%>
<%--
  Created by IntelliJ IDEA.
  User: janusz
  Date: 11.10.18
  Time: 13:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee</title>
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
        <th colspan="3">Action</th>
    </tr>
    <%
        Employee employeeOne =  (Employee) request.getAttribute("employee");
        String currName = employeeOne.getName();
        String currLastname = employeeOne.getLastname();
        String currAddress = employeeOne.getAddress();
        String currPhone = employeeOne.getPhone();
        String currNote = employeeOne.getNote();
        Double currPph = employeeOne.getPph();
        int currId = employeeOne.getId();
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
            <a href="/employeedelete?id=<%=currId%>">delete</a>
        </td>
        <td>
            <a href="/employeeedit?id=<%=currId%>">edit</a>
        </td>
        <td>
            <a href="/taskbyemployee?employee_id=<%=currId%>">Pokaż wszystkie Zlecenia</a>
        </td>

    </tr>

</table>
<jsp:include page="/WEB-INF/fragments/footer.jsp"/>
</body>
</html>