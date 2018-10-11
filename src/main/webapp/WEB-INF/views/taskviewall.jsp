<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dawid
  Date: 09.10.18
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Task View All</title>
<jsp:include page="/WEB-INF/fragments/header.jsp"/>
</head>
<body>
<jsp:include page="/WEB-INF/fragments/menu.jsp"/>

<table>
    <thead>
        <tr>
            <th>ID</th>
            <th>Data przyjęcia</th>
            <th>Data <br> startu naprawy</th>
            <th>Data końca naprawy</th>
            <th>ID Pracownika</th>
            <th>Opis Usterki</th>
            <th>Opis naprawy</th>
            <th>Status</th>
            <th>ID Samochodu</th>
            <th>Koszt Całkowity</th>
            <th>Koszt Części</th>
            <th>Ilość roboczogodzin</th>
            <th>Szczegóły </th>
        </tr>
    </thead>
    <tbody>
<c:forEach var="task" items="${tasks}">
    <tr>
        <td>${task.id}</td>
        <td>${task.check_in_date}</td>
        <td>${task.start_date}</td>
        <td>${task.end_date}</td>
        <td><a href="/employeeviewone?id=${task.employee_id}">${task.employee_id}</a></td>
        <td>${task.description}</td>
        <td>${task.result}</td>
        <td><a href="/taskbystatus?status_id=${task.status_id}">${task.status_id}</a></td>
        <td><a href="/carviewone?id=${task.car_id}">${task.car_id}</a></td>
        <td>${task.total_price}</td>
        <td>${task.part_cost}</td>
        <td>${task.hours}</td>
        <td><a href="/taskviewone?task_id=${task.id}"> Więcej ><a></td>
    </tr>
</c:forEach>
    </tbody>
</table>

<jsp:include page="/WEB-INF/fragments/footer.jsp"/>
</body>
</html>
