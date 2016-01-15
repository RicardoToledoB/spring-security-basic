<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>MAIN</h1>
        <br>
        ADMINISTRADOR<br>

        <ul >
            <li><a href="${pageContext.request.contextPath}/admin01">admin1</a></li>
            <li><a href="${pageContext.request.contextPath}/admin02">admin2</a></li>
            <li><a href="${pageContext.request.contextPath}/admin03">admin3</a></li>
        </ul>
        <br>
        EJECUTIVO<br>

        <ul >
            <li><a href="${pageContext.request.contextPath}/ejecutive01">ejecutive1</a></li>
            <li><a href="${pageContext.request.contextPath}/ejecutive02">ejecutive2</a></li>
            <li><a href="${pageContext.request.contextPath}/ejecutive03">ejecutive3</a></li>
        </ul>
    </body>
</html>
