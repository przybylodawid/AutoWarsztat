<%@ page import="pl.coderslab.models.Employee" %><%--
  Created by IntelliJ IDEA.
  User: janusz
  Date: 10.10.18
  Time: 21:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Employee</title>
    <%@include file="/WEB-INF/fragments/header.jsp" %>
</head>
<body>

<%@include file="/WEB-INF/fragments/menu.jsp"%>

<br><br>
<%
    Employee employeeOne =  (Employee) request.getAttribute("employee");
    int currId = employeeOne.getId();
    String currName = employeeOne.getName();
    String currLastname = employeeOne.getLastname();
    String currAddress = employeeOne.getAddress();
    String currPhone = employeeOne.getPhone();
    String currNote = employeeOne.getNote();
    Double currPph = employeeOne.getPph();
%>

<form action="employeeedit" method="post">
    <label>
        id: <input type="number" name="id" value="<%=currId%>" readonly/>
    </label> <br><br>
    <label>
        Name: <input type="text" name="name" value="<%=currName%>" />
    </label><br><br>
    <label>
        Lastname: <input type="text" name="lastname" value="<%=currLastname%>"/>
    </label><br><br>
    <label> Address: <input type="text" name="address" value="<%=currAddress%>" />
    </label> <br><br>
    <label> Phone: <input type="text" name="phone" value="<%=currPhone%>" />
    </label> <br><br>
    <label>
        Note: <input type="text" name="note" value="<%=currNote%>"/>
    </label> <br><br>
    <label> Pph: <input type="number" name="pph" value="<%=currPph%>"/>
    </label><br><br>

    <input type="submit" value="Wyślij" required/>

</form>
<jsp:include page="/WEB-INF/fragments/footer.jsp"/>
</body>
</html>