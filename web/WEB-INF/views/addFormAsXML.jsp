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
    <h1>You can add new type of Aircraft from XML object here</h1>
    <form class="mailForm" method="post" action="add">
        <table align="center">
            <tr>
                <td><label>XML object:</label></td>
                <td><textarea rows="12" cols="60" name="xmlObject" class="inputTextarea"></textarea></td>
            </tr>

        </table>
        <input class="submitMail" type="submit" value="Add New Aircraft" />
    </form>
</fieldset>
<hr class="hr">
</body>
</html>
