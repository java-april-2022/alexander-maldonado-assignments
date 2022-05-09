<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Book</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/main.css"/>
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>Add a Book to Your Shelf</h1>
	<a href="/books">back to shelves</a>
	<form:form action="/books/add" method="post" modelAttribute="newBook">
		<table>
			<tr>
				<td>Title</td>
				<td>
					<form:errors path="title"/>
					<form:input class form-control type="text" path="title"/>
				</td>
			</tr>
			<tr>
				<td>Author</td>
				<td>
					<form:errors path="author" />
					<form:input class form-control type="text" path="author"/>
				</td>
			</tr>
			<tr>
				<td>My Thoughts</td>
				<td>
					<form:errors path="discription" />
					<form:input path="discrption"/>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"/></td>
			</tr>
		</table>
	</form:form>
</body>
</html>