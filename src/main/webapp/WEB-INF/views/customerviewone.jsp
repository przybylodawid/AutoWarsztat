<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: bbi
  Date: 11.10.18
  Time: 10:37
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

<table>

    <th></th>
    <th>Dane klienta</th>

    <tr>
        <td>ID klienta</td>
        <td>${customer.id}</td>
    </tr>

    <tr>
        <td>Imię klienta</td>
        <td>${customer.name}</td>
    </tr>
    <tr>
        <td>Nazwisko klienta</td>
        <td>${customer.lastname}</td>
    </tr>
    <tr>
        <td>Data urodzenia klienta</td>
        <td>${customer.bdate}</td>
    </tr>

</table><br>

<a href="/customerdelete?customer_id=${customer.id}">usuń klienta</a><br>
<a href="/customeredit?customer_id=${customer.id}">edytuj klienta</a><br>
<a href="/carsviewbycustomer?customer_id=${customer.id}">Pokaż wszystkie samochody klienta</a><br>



<jsp:include page="/WEB-INF/fragments/footer.jsp"/>
</body>
</html>
