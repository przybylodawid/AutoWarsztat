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
    <title>Car Add New</title>
</head>
<body>
<jsp:include page="/WEB-INF/fragments/header.jsp"/>
<%@include file="/WEB-INF/fragments/menu.jsp"%>



<form action="caraddnew" method="post">

    <table>
        <tr>
            <td>Model:</td>
            <td><input type="text" name="model" required/></td><
        </tr>

        <tr>
            <td>Marka:</td>
            <td> <input type="text" name="brand" required/></td>
        </tr>

        <tr>
            <td>Rocznik:</td>
            <td><input type="number" name="year" required/></td>
        </tr>

        <tr>
            <td>Nr rej.:</td>
            <td><input type="text" name="plate" required/></td>
        </tr>

        <tr>
            <td>Nast. przegląd:</td>
            <td><input type="date" name="next_check" required/></td>
        </tr>

        <tr>
            <td>ID klienta:</td>
            <td><input type="number" name="customer_id" required/></td>
        </tr>


</table>
    <input type="submit" value="Wyślij" /><br>
</form>


<jsp:include page="/WEB-INF/fragments/footer.jsp"/>

</body>
</html>
