<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Create Dojo</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<!-- <link rel="stylesheet" type="text/css" href="/css/style.css"> -->
	</head>

	<body>
		<div class="container">
			<div class="row header">
				<div class="col-md-3"></div>
				<div class="col-md-6"></div>
				<div class="col-md-3"></div>
			</div>
			<br>
			<br>
			<br>
			<div class="row">
				<div class="col-md-3"></div>
				<div class="col-md-6">
					<h2 class="text-center"><c:out value="${dojo.name}"/> Location Ninjas:</h2>
					<table class="table table-striped">
						<thead>
							<tr>
								<th>First Name:</th>
								<th>Last Name:</th>
								<th>Age</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${dojo.ninjas}" var="ninja">
								<tr>
									<td>${ninja.firstName}</td>
									<td>${ninja.lastName}</td>
									<td>${ninja.age}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
				<div class="col-md-3"></div>
			</div>
			<br>
			<br>
			<div class="row footer">
				<div class="col-md-3"></div>
				<div class="col-md-6 text-center">
					<p><a href="/dojos/new">Add Dojo</a> | <a href="/ninjas/new">Add Ninja</a></p>
				</div>
				<div class="col-md-3"></div>
			</div>
		</div>
	</body>
</html>