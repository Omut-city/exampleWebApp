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
            <th>ID</th>
            <th>Type</th>
            <th>Manufacturer</th>
            <th>Number of engines</th>
            <th>Range distance</th>
            <th>Cruise speed</th>
            <th>Passenger capacity</th>
            <th>View as XML</th>
            <th>Download as XML</th>
        </tr>
        <%! private int count = 0; %>
        <c:forEach items="${list}" var="item">
            <tr>
                <td><p><%= ++count %></p></td>
                <td>${item.id}</td>
                <td>${item.type}</td>
                <td>${item.manufacturer}</td>
                <td>${item.number_engines}</td>
                <td>${item.range_distance}</td>
                <td>${item.cruise_speed}</td>
                <td>${item.passenger_capacity}</td>
                <td><a href="viewAsXML/${item.id}">View as XML</a></td>
                <td><a href="downloadAsXML/${item.id}">Download as XML</a></td>
            </tr>
        </c:forEach>
        <!-- <%= count=0 %> -->
    </table>
    <form method="post" action="/addForm">
        <input class="submitMail" type="submit" value="Add New Aircraft" />
    </form>
    <form method="post" action="/addAsXML">
        <input class="submitMail" type="submit" value="Add New Aircraft as XML" />
    </form>
</fieldset>
<hr class="hr">
</body>
</html>
