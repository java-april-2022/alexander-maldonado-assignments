<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>View Book</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/main.css"/>
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<h1><c:out value="${book.title}"></c:out></h1>
	<h3>read by <c:out value="${book.author}"></c:out></h3>
	<h3>Here are <c:out value="${book.user.name}}"></c:out>'s thoughts:</h3>
	<div>
		<hr>
		<p><c:out value="${book.discription}"></c:out></p>
		<hr>
	</div>
	<button><a href="/books">back to shelves</a></button>
	<a href="/books/${book.id}/edit"></a>
</body>
</html>