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
    <legend>Add Aircraft</legend>
    <h1>You can add new type of Aircraft here</h1>
    <form class="mailForm" method="post" action="add">
        <table align="center">
            <tr>
                <td><label>ID:</label></td>
                <td><input type="text" name="id" class="inputTextarea"/></td>
            </tr>
            <tr>
                <td><label>Type:</label></td>
                <td><input type="text" name="type" class="inputTextarea"/></td>
            </tr>
            <tr>
                <td><label>Manufacturer:</label></td>
                <td><input type="text" name="manufacturer" class="inputTextarea"/></td>
            </tr>
            <tr>
                <td><label>Number of engines:</label></td>
                <td><input type="text" name="number_engines" class="inputTextarea"/></td>
            </tr>
            <tr>
                <td><label>Range distance:</label></td>
                <td><input type="text" name="range_distance" class="inputTextarea"/></td>
            </tr>
            <tr>
                <td><label>Cruise speed:</label></td>
                <td><input type="text" name="cruise_speed" class="inputTextarea"/></td>
            </tr>
            <tr>
                <td><label>Passenger's capacity:</label></td>
                <td><input type="text" name="passenger_capacity" class="inputTextarea"/></td>
            </tr>
        </table>
        <input class="submitMail" type="submit" value="Add New Aircraft" />
    </form>
</fieldset>
<hr class="hr">
</body>
</html>
