<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width,initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-glyphicons.css"
	rel="stylesheet">
<title>Shop Management</title>
<style>
.carousel-inner img {
	width: 100%;
	height: 100%;
}
</style>
</head>
<body>

	<nav class="navbar navbar-expand-sm bg-success navbar-dark">
		<a class="navbar-brand" href="/home">Shop Management</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#collapsibleNavbar">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="collapsibleNavbar">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link"
					href="/owner-login-page">Owner-Login</a></li>
				<li class="nav-item"><a class="nav-link"
					href="/employee-login-page">Employee-Login</a></li>
				<li class="nav-item"><a class="nav-link" href="/owner-register">Owner
						SignUp </a></li>
				<li class="nav-item"><a class="nav-link"
					href="/employee-register">Employee SignUp</a></li>
			</ul>
		</div>
	</nav>
	<br>
	<br>
	<c:choose>
		<c:when test="${mode=='MODE_HOME'}">
			<div class="container" id="homediv">
				<div class="jumbotron text-center">
					<h1>Welcome to Shop Management</h1>
					<h3>This is working</h3>
				</div>
			</div>
		</c:when>



		<c:when test="${mode=='MODE_OWNER_REGISTER'}">
			<div class="container">
				<h3>Owner Registration</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="save-owner">
					<div class="form-group">
						<label class="col-md-3">Owner Name</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="ownername"
								value="${owner.ownername}" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-3">Owner Address</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="owneraddress"
								value="${owner.owneraddress }" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-3">Owner Phone</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="ownerphone"
								value="${owner.ownerphone}" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-3">Owner Password</label>
						<div class="col-md-7">
							<input type="password" class="form-control" name="ownerpassword"
								value="${owner.ownerpassword }" />
						</div>
					</div>

					<div class="form-group ">
						<label class="col-md-3"></label>
						<div class="col-md-7">
							<input type="submit" class="btn btn-primary" value="Register" />
						</div>
					</div>

				</form>
			</div>
		</c:when>

		<c:when test="${mode=='MODE_OWNER_LOGIN'}">
			<div class="container">
				<h3>Owner Login</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="/owner-login">
					<div class="form-group">
						<label class="col-md-3">Owner Name</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="ownername"
								value="${owner.ownername}" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-3">Owner Password</label>
						<div class="col-md-7">
							<input type="password" class="form-control" name="ownerpassword"
								value="${owner.ownerpassword }" />
						</div>
					</div>
					<div class="form-group ">
						<label class="col-md-3"></label>
						<div class="col-md-7">
							<input type="submit" class="btn btn-primary" value="Register" />
						</div>
					</div>

				</form>
			</div>
		</c:when>

		<c:when test="${mode=='MODE_EMPLOYEE_REGISTER'}">
			<div class="container">
				<h3>Employee Registration</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="save-employee">
					<div class="form-group">
						<label class="col-md-3">Employee Name</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="employeename"
								value="${employee.employeename}" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-3">Employee Address</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="employeeaddress"
								value="${employee.employeeaddress }" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-3">Employee Phone</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="employeephone"
								value="${employee.employeephone}" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-3">Employee Password</label>
						<div class="col-md-7">
							<input type="password" class="form-control"
								name="employeepassword" value="${employee.employeepassword }" />
						</div>
					</div>

					<div class="form-group ">
						<label class="col-md-3"></label>
						<div class="col-md-7">
							<input type="submit" class="btn btn-primary" value="Register" />
						</div>
					</div>

				</form>
			</div>
		</c:when>
		
				<c:when test="${mode=='MODE_EMPLOYEE_LOGIN'}">
			<div class="container">
				<h3>Employee Login</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="/employee-login">
					<div class="form-group">
						<label class="col-md-3">Employee Name</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="employeename"
								value="${employee.employeename}" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-3">Employee Password</label>
						<div class="col-md-7">
							<input type="password" class="form-control" name="employeepassword"
								value="${employee.employeepassword }" />
						</div>
					</div>
					<div class="form-group ">
						<label class="col-md-3"></label>
						<div class="col-md-7">
							<input type="submit" class="btn btn-primary" value="Register" />
						</div>
					</div>

				</form>
			</div>
		</c:when>

	</c:choose>


</body>
</html>