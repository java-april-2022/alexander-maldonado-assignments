<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Dojo</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/main.css"/>
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>Create Dojo</h1>
	<form:form  method="POST" action="/dojo/createDojo" modelAttribute="dojo">
		<p>
			<div class="mb-3">
			  <form:label path="name" class="form-label">Dojo</form:label>
			  <form:input class="form-control" path="name"/>
			</div>		 
		</p>
			<button type="submit" class="btn btn-primary">Create Dojo</button>
	</form:form>
</body>
</html>