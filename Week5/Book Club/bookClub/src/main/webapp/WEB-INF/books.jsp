<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome User</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/main.css"/>
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div>
	<h1>Welcome,<c:out value="${user.name}"/></h1>
	<p>Books from everyone's shelves</p>
	</div>
	<div>
	<a href="/logout">Logout</a>
	<a href="/books/add"> Add to my shelf</a>
	</div>
	<table class="table table-success table-striped">
		<tr>
			<th>ID</th>
			<th>Title</th>
			<th>Author Name</th>
			<th>Posted By</th>
		</tr>
		<c:forEach var="book" items="${books}">
			<tr>
				<td>${book.id}</td>
				<td><a href="books/${book.id}"><c:out value="${book.title}"/></a></td>
				<td>${book.author}</td>
				<td>?</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>