<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
		 		<th>Actions</th>
		 	</tr>
		 </thead>
			 <tbody>
			 	<c:forEach var="expense" items="${expense}">
			 		<tr>
			 			<td><a href="/expense/view/${expense.id}"><c:out value="${expense.name}"/></a></td>
			 			<td><c:out value="${expense.vendor}"></c:out></td>
			 			<td>$<c:out value="${expense.amount}"></c:out></td>
			 			<td>
			 			<a href="/expense/edit/${expense.id}">edit</a>
						<a href="/expense/delete/${expense.id}">delete</a>
			 			</td>
			 		</tr>
			 	</c:forEach>
			 </tbody>
		</table>
	</div>
	<div>
		<h1>Add an expense:</h1>
		<form:form  action="/expense" modelAttribute="expenseAdd" method="post">
			<div class="mb-3">
				<form:label path="name" >Expense Name: </form:label>
				<form:errors path="name"/>
				<form:input path="name" type="text" class="form-control" />
			</div>
			<div class="mb-3">
				<form:label path="vendor">Vendor: </form:label>
				<form:errors path="vendor"/>
				<form:input path="vendor" type="text" class="form-control"/>
			</div>
			<div class="mb-3">
				<form:label path="amount">Amount: </form:label>
				<form:errors path="amount"/>
				<form:input path="amount" type="number" step="0.01" class="form-control" />
			</div>
			<div class="mb-3">
				<form:label  path="description">Description: </form:label>
				<form:errors path="description"/>
				<form:textarea path="description" class="form-control"  rows="3"/>
			</div>
			<input type="submit" value="Submit"/>
		</form:form>
	</div>
</body>
</html>