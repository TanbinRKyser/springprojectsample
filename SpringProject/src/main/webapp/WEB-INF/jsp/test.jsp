<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
Hello World
<div class="container">
        <c:forEach var="comment" items="${ log2 }">
            <p><h4><legend>${ comment.getUsername() }</legend></h4> : ${ comment.getPassword() }</p>
        </c:forEach>
    </div>