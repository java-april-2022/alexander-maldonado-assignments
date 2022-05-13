<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Expense Details</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/main.css"/>
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div>
		<h1>Viewing Expense:</h1>
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
</body>
</html>