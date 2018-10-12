<%--
  Created by IntelliJ IDEA.
  User: xczappa
  Date: 11.10.18
  Time: 08:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Car Edit FORM</title>
</head>
<body>
<jsp:include page="/WEB-INF/fragments/header.jsp"/>
<%@include file="/WEB-INF/fragments/menu.jsp" %>

<form action="caredit" method="post">

    <table>
        <tr>
            <td>id:</td>
            <td><input name="id" value="${carone.id}" readonly/></td>
        </tr>

        <tr>
            <td>Model:</td>
            <td><input type="text" name="model" value="${carone.model}"/></td>
        </tr>

        <tr>
            <td>Marka:</td>
            <td><input type="text" name="brand" value="${carone.brand}"/></td>
        </tr>

        <tr>
            <td>Rocznik:</td>
            <td><input type="number" name="year" value="${carone.year}"/></td>
        </tr>

        <tr>
            <td>Nr rej.:</td>
            <td><input type="text" name="plate" value="${carone.plate}"/></td>
        </tr>

        <tr>
            <td>Nast. przegląd:</td>
            <td><input type="date" name="next_check" value="${carone.next_check}"/></td>
        </tr>

        <tr>
            <td>ID klienta:</td>
            <td><input type="number" name="customer_id" value="${carone.customer_id}"/></td>
        </tr>


    </table>

    <input type="submit" value="Wyślij"/><br>

</form>


<jsp:include page="/WEB-INF/fragments/footer.jsp"/>

</body>
</html>
