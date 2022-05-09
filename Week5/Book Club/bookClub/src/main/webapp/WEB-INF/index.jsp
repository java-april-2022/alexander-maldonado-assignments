<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Registration/Log in</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/main.css"/>
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>Welcome!</h1>
	<p>Join our growing community.</p>
<form:form action="/register" modelAttribute="newUser"  method="post">
	<h4>Register</h4>
	<table>
	    <thead>
	    	<tr>
	            <td>Name:</td>
	            <td>
	            	<form:errors path="name"/>
					<form:input class="form-control" type="text" path="name"/>
	            </td>
	        </tr>
	        <tr>
	            <td>Email:</td>
	            <td>
	            	<form:errors path="email"/>
					<form:input path="email" type="email" class="form-control"/>
	            </td>
	        </tr>
	        <tr>
	            <td>Password:</td>
	            <td>
	            	<form:errors path="password"/>
					<form:input class="form-control" type="password" path="password"/>
	            </td>
	        </tr>
	        <tr>
	            <td >Confirm Password:</td>
	            <td>
	            	<form:errors path="confirm" />
					<form:input type="password" class="form-control" path="confirm"/>
	            </td>
	        </tr>
	        <tr>
	        	<td><input type="submit" value="Submit"/></td>
	        </tr>
	    </thead>
	</table>
	</form:form>
	<form:form action="/login" modelAttribute="newLogin">
		<h4>Log In</h4>
		<table>
		    <thead>
		        <tr>
		            <td>Email:</td>
		            <td>
		            	<form:errors path="email"/>
						<form:input class="form-control" path="email" type ="text"/>
		            </td>
		        </tr>
		        <tr>
		            <td>Password:</td>
		            <td>
		            	<form:errors path="password"/>
						<form:input class="form-control" path="password" type="password"/>
		            </td>
		        </tr>
		        <tr>
		        	<td><input type="submit" value="Submit"/></td>
		        </tr>
		    </thead>
		</table>
	</form:form>
</body>
</html>