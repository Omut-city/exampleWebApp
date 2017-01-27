<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="include/header.jsp"/>
<body>
<h1>${greeting}</h1>
<jsp:include page="include/menu.jsp"/>
<hr class="hr">
<div class="systemMessage">
    <p><span class="systemResponce">${response}</span></p>
</div>
<fieldset class="fieldset">
    <legend>Output (plain/txt)</legend>
    <h1>Table Airplane</h1>
    <table class="tableData">
        <tr>
            <th>N</th>
            <th>String</th>
        </tr>
        <%! private int count = 0; %>
        <c:forEach items="${listAsXML}" var="item">
            <tr>
                <td><p><%= ++count %></p></td>
                <td>${item}</td>
            </tr>
        </c:forEach>
        <!-- <%= count=0 %> -->
    </table>
    <form method="get" action="/add">
        <input class="submitMail" type="submit" value="Add New Aircraft" />
    </form>
</fieldset>
<hr class="hr">
</body>
</html>
