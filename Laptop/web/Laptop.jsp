<%-- 
    Document   : Laptop
    Created on : Oct 8, 2023, 1:47:34 PM
    Author     : Thanh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <tr>
                <th>ID</th>
                <th>name</th>
                <th>price</th>
                <th>color</th>
            </tr>
            <c:forEach items="${requestScope.laptop}" var="l"> 
                <tr>
                    <td>${l.id}</td>
                    <td>${l.name}</td>
                    <td>${l.price}</td>
                    <td>${l.color}</td>
                    <td>
                        <button >
                        <a href="delete?id=${l.getId()}" class="delete" data-toggle="modal">delete</a></button>
                    </td>
                </tr>
            </c:forEach  >



        </table>
    </body>
</html>
