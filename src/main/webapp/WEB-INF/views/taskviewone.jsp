<%--
  Created by IntelliJ IDEA.
  User: dawid
  Date: 11.10.18
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
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
    <title>Szczegóły zlecenia nr: ${task.id}</title>
    <jsp:include page="/WEB-INF/fragments/header.jsp"/>
</head>
<body>
<jsp:include page="/WEB-INF/fragments/menu.jsp"/>

<table class="table table-striped table-bordered table-hover" id="carsviewall">
    <thead>
    <tr>

        <th colspan="2">Zlecenie nr:
        ${task.id}</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>Data przyjęcia</td>
        <td>${task.check_in_date}</td>
    </tr>
    <tr>
        <td>Start Naprawy</td>
        <td>${task.start_date}</td>
    </tr>
    <tr>
        <td>Koniec naprawy</td>
        <td>${task.end_date}</td>
    </tr>
    <tr>
        <td>ID Pracownika</td>
        <td><a href="/employeeviewone?employee_id=${task.employee_id}">${task.employee_id}</a></td>
    </tr>
    <tr>
        <td>Opis usterki</td>
        <td>${task.description}</td>
    </tr>
    <tr>
        <td>Opis Narawy</td>
        <td>${task.result}</td>
    </tr>
    <tr>
        <td>Status</td>
        <td><a href="/taskbystatus?status_id=${task.status_id}">${task.status_id}</a></td>
    </tr>
    <tr>
        <td>ID Samochodu</td>
        <td><a href="/carviewone?car_id=${task.car_id}">${task.car_id}</a></td>
    </tr>
    <tr>
        <td>Koszt całkowity</td>
        <td>${task.total_price}</td>
    </tr>
    <tr>
        <td>Koszt części</td>
        <td>${task.part_cost}</td>
    </tr>
    <tr>
        <td>Ilość roboczogodzin</td>
        <td>${task.hours}</td>
    </tr>


    </tbody>
</table>
<a href="/taskdelete?task_id=${task.id}"> USUŃ</a> <a href="/taskedit?task_id=${task.id}">EYCJA</a>

<jsp:include page="/WEB-INF/fragments/footer.jsp"/>
</body>
</html>

</body>
</html>
