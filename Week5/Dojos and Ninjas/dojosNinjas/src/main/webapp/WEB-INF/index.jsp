<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Ninja</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/main.css"/>
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<form:form action="/ninja/createNinja"  method="POST" modelAttribute="ninja">
        <h1 style="color: yellow;">Create a Ninja</h1>
        <p>
			<form:label path="dojo" class="form-label">Dojo</form:label>
			<form:select class="form-control" path="dojo">
				<c:forEach items="${allDojos}" var="dojo">
					<option value="${dojo.id}">${dojo.name}</option>
				</c:forEach>
			</form:select>
		</p>
        <div class="mb-3">
            <form:label path="firstName" class="form-label" >First Name</form:label>
            <form:input path="firstName" type="text" class="form-control" name="firstName" placeholder="First Name"/>
        </div>
        <div class="mb-3">
            <form:label path="lastName" class="form-label" >Last Name</form:label>
            <form:input path="lastName" type="text" class="form-control" name="lastName" placeholder="Last Name"/>
        </div>
        <div class="mb-3">
            <form:label path="age" class="form-label" >Age</form:label>
            <form:input path="age" type="number" class="form-control" name="age"/>
        </div>
        	<input type="submit" value="Send">
      </form:form>
</body>
</html>