<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Omikuji Form</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div style="background-color: rgb(18, 18, 32); width: 500px;">
        <div style="margin: 30px;">
            <form action="/process" method="post">
                <h1 style="color: yellow;">Send an Omikuji</h1>
                <div class="mb-3">
                    <label for="number" class="form-label" style="color: white;">Pick any number.</label>
                    <input type="number" class="form-control" name="number" id="exampleFormControlInput1">
                </div>
                <div class="mb-3">
                    <label for="city" class="form-label" style="color: white;">Enter the name of any city.</label>
                    <input type="text" class="form-control" name="city" id="exampleFormControlInput1" placeholder="City">
                </div>
                <div class="mb-3">
                    <label for="name" class="form-label" style="color: white;">Enter a name of any real person.</label>
                    <input type="text" class="form-control" name="name" id="exampleFormControlInput1" placeholder="Full Name">
                </div>
                <div class="mb-3">
                    <label for="hobby" class="form-label" style="color: white;">Enter professional endeavor or hobby.</label>
                    <input type="text" class="form-control" name="hobby" id="exampleFormControlInput1" placeholder="Hobby">
                </div>
                <div class="mb-3">
                    <label for="animal" class="form-label" style="color: white;">Enter any type of living thing.</label>
                    <input type="text" class="form-control" name="animal" id="exampleFormControlInput1" placeholder="Animal">
                </div>
                <div class="mb-3">
                    <label for="comment" class="form-label" style="color: white;">Say something nice to someone:</label>
                    <textarea name="comment" class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
                </div>
                <p style="color: white;" >Send and show a friend!</p>
                <input type="submit" value="Send">
            </form>
        </div>
    </div>
</body>
</html>