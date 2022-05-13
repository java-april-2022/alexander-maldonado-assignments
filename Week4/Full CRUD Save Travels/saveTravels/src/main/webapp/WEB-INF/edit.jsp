<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Expense</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/main.css"/>
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>Edit Expense:</h1>
		<form:form  action="/expense/${expense.id}" modelAttribute="expense" method="post">
			<input type="hidden" name="_method" value="put"/>
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
			<input type="submit" value="Edit"/>
			<a href="/">Go Back</a>
		</form:form>
</body>
</html>