<%--
  Created by IntelliJ IDEA.
  User: bbi
  Date: 04.10.18
  Time: 09:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <jsp:include page="WEB-INF/fragments/header.jsp"/>
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


Treść strony <br>




<jsp:include page="WEB-INF/fragments/footer.jsp"/>

</body>
</html>