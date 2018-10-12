<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: bbi
  Date: 09.10.18
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer View All</title>
    <jsp:include page="/WEB-INF/fragments/header.jsp"/>
</head>
<body>
<jsp:include page="/WEB-INF/fragments/menu.jsp"/>


<table class="table table-striped table-bordered table-hover" id="carsviewall">

    <tr>
    <th>ID klienta</th>
    <th>Imię klienta</th>
    <th>Nazwisko klienta</th>
    <th>Data urodzenia klienta</th>
        <th>Akcja</th>
    </tr>

<c:forEach var="customer" items="${customers}">
   <tr>
       <td> ${customer.id}</td>
       <td> ${customer.name}</td>
       <td>${customer.lastname}</td>
       <td>${customer.bdate} </td>
       <td><a href="/customerviewone?id=${customer.id}">szczegóły..</a></td>

   </tr>

</c:forEach>

</table>



<jsp:include page="/WEB-INF/fragments/footer.jsp"/>
</body>
</html>
