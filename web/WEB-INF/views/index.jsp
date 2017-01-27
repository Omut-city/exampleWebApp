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
<hr class="hr">
</body>
</html>