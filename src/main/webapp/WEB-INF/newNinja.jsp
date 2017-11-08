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
		<title>Create/Add Ninja</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<!-- <link rel="stylesheet" type="text/css" href="/css/style.css"> -->
	</head>

	<body>
		<div class="container">
			<div class="row">
				<div class="col-md-6">
					<h2>Create/Add Ninja</h2>
					<p><a href="/dojos/new">Create Dojo</a></p>
					<form:form method="POST" action="/ninjas/new/" modelAttribute="ninja">
						<form:hidden path="id"/>
						<form:label path="dojo">Dojo:
						<form:select path="dojo" class="form-control">
							<option value="" disabled selected>Select Dojo</option>
							<c:forEach items="${dojos}" var="dojo">
								<form:option value="${dojo}" label="${dojo.name}"/>
							</c:forEach></form:select></form:label>
						<br>
						<br>
						<form:label path="firstName">First Name:
						<form:errors path="firstName"/>
						<form:input path="firstName" class="form-control"/></form:label>
						<br>
						<br>
						<form:label path="lastName">Last Name:
						<form:errors path="lastName"/>
						<form:input path="lastName" class="form-control"/></form:label>
						<br>
						<br>
						<form:label path="age">Age:
						<form:errors path="age"/>
						<form:input path="age" type="number" min="18" max="99" value="18" class="form-control text-center"/></form:label>
						<br>
						<br>
						<input type="submit" value="Create" class="btn btn-success"/>
					</form:form>
				</div>
				<div class="col-md-6"></div>
			</div>
		</div>
	</body>
</html>