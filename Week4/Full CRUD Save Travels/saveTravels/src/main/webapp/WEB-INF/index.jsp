<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Travels</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/main.css"/>
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<h1>Save Travels</h1>
	<div>
		<table class="table table-dark table-hover">
		 <thead>
		 	<tr>
		 		<th>Expense</th>
		 		<th>Vendor</th>
		 		<th>Amount</th>
		 	</tr>
		 </thead>
		 <tbody>
		 	<c:forEach var="expense" items="${expenses}">
		 		<tr>
		 			<td><c:out value=""></c:out></td>
		 			<td><c:out value=""></c:out></td>
		 			<td><c:out value=""></c:out></td>
		 		</tr>
		 	</c:forEach>
		 </tbody>
		</table>
	</div>
	<div>
		<h1>Add an expense:</h1>
		<div class="mb-3">
		  <label for="expenseName" class="form-label">Example label</label>
		  <input type="text" class="form-control" id="expenseName">
		</div>
		<div class="mb-3">
		  <label for="vendor" class="form-label">Another label</label>
		  <input type="text" class="form-control" id="vendor">
		</div>
		<div class="mb-3">
		  <label for="amount" class="form-label">Example label</label>
		  <input type="text" class="form-control" id="amount">
		</div>
		<div class="mb-3">
		  <label for="description" class="form-label">Another label</label>
		  <textarea class="form-control" id="description" rows="3"></textarea>
		</div>
		<button>Submit</button>
	</div>
</body>
</html>