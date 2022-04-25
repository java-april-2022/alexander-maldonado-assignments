<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fruity Loops</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/fruityloop.css"/>
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>Fruit Store</h1>
	<table class="table table-success table-striped">
		<tr>
			<th>Fruits</th>
			<th>Prices</th>
		</tr>
		<c:forEach var="fruit" items="${fruits}">
			<tr>
				<th>${fruit.name}</th>
				<th>${fruit.price}</th>
			</tr>
		</c:forEach>
	</table>
</body>
</html>