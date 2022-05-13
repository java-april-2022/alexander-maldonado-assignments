<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h1>Warning Confirmation:</h1>
		<hr>
		<table>
			<thead>
				<tr>
					<th><c:out value="${expense.name}"/></th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><c:out value="${expense.vendor}"></c:out></td>
				</tr>
				<tr>
					<td>$<c:out value="${expense.amount}"></c:out></td>
				</tr>
				<tr>
					<td><c:out value="${expense.description}"/></td>
				</tr>
			</tbody>
		</table>
		<a href="/">Go Back</a>
		<a href="/expense/edit/${expense.id}">edit</a>
	</div>
	<hr>
	<h1>Confirm Deletion Below</h1>
	<form action="/expense/${expense.id}" method="post">
		<input type="hidden" name="_method" value="delete"/>
		<input type="submit" value="Delete"/>
	</form>
</body>
</html>