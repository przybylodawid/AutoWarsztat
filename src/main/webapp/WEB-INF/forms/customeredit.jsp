<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: bbi
  Date: 09.10.18
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <jsp:include page="/WEB-INF/fragments/header.jsp"/>
</head>
<body>

<br><br>
<a href="/employeeviewall">PRACOWNICY</a>
<a href="/carviewall">SAMOCHOY</a>
<a href="/taskviewall">ZLECENIA</a>
<a href="/customerviewall">KLIENCI</a>
<br>
<a href="/employeeaddnew"> (+)Pracownik</a>
<a href="/caraddnew">(+)Samochod</a>
<a href="/taskaddnew">(+)Zlecenie</a>
<a href="/customeraddnew">(+)Klient</a><br><br>

<form action="/customeredit" method="post">


    <table>

        <th>Edycja danych klienta</th>
        <th></th>

        <tr>
            <td>Id:</td>
            <td><input type="text" name="id" value="${customer.id}" READONLY/></td>
        </tr>

        <tr>
            <td>Imię:</td>
            <td><input type="text" name="name" value="${customer.name}"/></td>
        </tr>

        <tr>
            <td>Nazwisko:</td>
            <td><input type="text" name="lastname" value="${customer.lastname}"/></td>
        </tr>
        <tr>
            <td>Data urodzenia:</td>
            <td><input type="date" name="bdate" value="${customer.bdate}"/></td>
        </tr>

    </table>
        <input type="submit" value="Wyślij">

</form>


<jsp:include page="/WEB-INF/fragments/footer.jsp"/>

</body>
</html>
