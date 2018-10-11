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
    <title>Edycja zlecenia nr: ${task.id}</title>
    <jsp:include page="/WEB-INF/fragments/header.jsp"/>
</head>
<body>
<jsp:include page="/WEB-INF/fragments/menu.jsp"/>
<form action="" method="post">

    <table>
        <thead>
        <tr>

            <th colspan="2">Edycja danych Zlecenia nr:
                ${task.id}</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>ID</td>
            <td><input type="text" name="id" value="${task.id}" readonly></td>
        </tr>
        <tr>
            <td>Data przyjęcia</td>
            <td><input type="date" name="check_in_date" value="${task.check_in_date}" readonly></td>
        </tr>
        <tr>
            <td>Start Naprawy</td>
            <td><input type="date" name="start_date" value="${task.start_date}"></td>
        </tr>
        <tr>
            <td> Data przewidywana <br>/końca naprawy</td>
            <td><input type="date" name="end_date" value="${task.end_date}" required></td>
        </tr>
        <tr>
            <td>ID Pracownika</td>
            <td><input type="number" name="employee_id" value="${task.employee_id}"></td>
        </tr>
        <tr>
            <td>Opis usterki</td>
            <td><input type="textarea" name="description" value="${task.description}"></td>
        </tr>
        <tr>
            <td>Opis Narawy</td>
            <td><input type="textarea" name="result" value="${task.result}"></td>
        </tr>
        <tr>
            <td>Status</td>
            <td><select name="status_id">
                <option value="1">1 - Przyjęty</option>
                <option value="2">2 - Zatwierdone koszty</option>
                <option value="3">3 - W naprwie</option>
                <option value="4">4 - Gotowy</option>
                <option value="5">5 - Rezygnacja</option>
            </select>

                </td>
        </tr>
        <tr>
            <td>ID Samochodu</td>
            <td><input type="number" name="car_id" value="${task.car_id}"></td>
        </tr>
        <tr>
            <td>Koszt całkowity</td>
            <td><input type="number" name="total_price" value="${task.total_price}"></td>
        </tr>
        <tr>
            <td>Koszt części</td>
            <td><input type="number" name="part_cost" value="${task.part_cost}"></td>
        </tr>
        <tr>
            <td>Ilość roboczogodzin</td>
            <td><input type="number" name="hours" value="${task.hours}"></td>
        </tr>


        </tbody>
    </table>
    <input type="submit" value="ZAPISZ">
</form>

<jsp:include page="/WEB-INF/fragments/footer.jsp"/>
</body>
</html>
