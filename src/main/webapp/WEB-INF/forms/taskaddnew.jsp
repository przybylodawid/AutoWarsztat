<%--
  Created by IntelliJ IDEA.
  User: dawid
  Date: 11.10.18
  Time: 12:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodawanie nowego zlecenia</title>
    <jsp:include page="/WEB-INF/fragments/header.jsp"/>
</head>
<body>
<jsp:include page="/WEB-INF/fragments/menu.jsp"/>
<form action="" method="post">

    <table>
        <thead>
        <tr>

            <th colspan="2">Dodawanie nowego zlecenia</th>
        </tr>
        </thead>
        <tbody>

        <tr>
            <td>Start Naprawy</td>
            <td><input type="date" name="start_date" value="" required></td>
        </tr>
        <tr>
            <td>ID Pracownika</td>
            <td><input type="number" name="employee_id" value="" required></td>
        </tr>
        <tr>
            <td>Opis usterki</td>
            <td><input type="textarea" name="description" value="" required></td>
        </tr>


        <tr>
            <td>ID Samochodu</td>
            <td><input type="number" name="car_id" value="" required></td>
        </tr>




        </tbody>
    </table>
    <input type="submit" value="ZAPISZ">
</form>

<jsp:include page="/WEB-INF/fragments/footer.jsp"/>
</body>
</html>