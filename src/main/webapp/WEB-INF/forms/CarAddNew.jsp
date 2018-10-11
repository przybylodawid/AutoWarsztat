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

<form action="caraddnew" method="post">
    <label>
        Model: <input type="text" name="model" required/><br>
    </label>
    <label>
        Marka: <input type="text" name="brand" required/><br>
    </label>
    <label>
        Rocznik: <input type="number" name="year" required/><br>
    </label>
    <label>
        Nr rej.: <input type="text" name="plate" required/><br>
    </label>
    <label>
        Nast. przeglad: <input type="date" name="next_check" required/><br>
    </label>
    <label>
        ID klienta: <input type="number" name="customer_id" required/><br>
    </label>
    <input type="submit" value="Wyślij" /><br>

</form>


<jsp:include page="/WEB-INF/fragments/footer.jsp"/>

</body>
</html>
