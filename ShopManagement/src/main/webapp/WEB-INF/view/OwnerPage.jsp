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
				<li class="nav-item"><a class="nav-link" href="/add-product">Add
						Product</a></li>
				<li class="nav-item"><a class="nav-link" href="/add-supplier">Add
						Supplier</a></li>
				<li class="nav-item"><a class="nav-link" href="/show-product">Show
						Product</a></li>
				<li class="nav-item"><a class="nav-link" href="/show-supplier">Show
						Supplier</a></li>
			</ul>
		</div>
	</nav>
	<br>
	<br>
	<c:choose>
		<c:when test="${mode=='MODE_OWNER_HOME'}">
			<div class="container" id="homediv">
				<div class="jumbotron text-center">
					<h1>Welcome ${owner.ownername}</h1>
					<h3>This is working</h3>
				</div>
			</div>
		</c:when>

		<c:when test="${mode=='MODE_ADD_PRODUCT'}">
			<div class="container">
				<h3>New Product</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="save-product">
					<div class="form-group">
						<label class="col-md-3">Product ID</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="productid"
								value="${product.productid}" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-3">Product Name</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="productname"
								value="${product.productname}" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-3">Product Type</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="producttype"
								value="${product.producttype}" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-3">Company Name</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="companyname"
								value="${product.companyname}" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-3">Price</label>
						<div class="col-md-7">
							<input type="number" class="form-control" name="price"
								value="${product.price}" />
						</div>
					</div>

					<div class="form-group ">
						<label class="col-md-3"></label>
						<div class="col-md-7">
							<input type="submit" class="btn btn-primary" value="ADD" />
						</div>
					</div>

				</form>
			</div>
		</c:when>

		<c:when test="${mode=='MODE_UPDATE'}">
			<div class="container">
				<h3>Update Product</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="save-product">
					<div class="form-group">
						<label class="col-md-3">Product ID</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="productid"
								value="${product.productid}" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-3">Product Name</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="productname"
								value="${product.productname}" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-3">Product Type</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="producttype"
								value="${product.producttype}" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-3">Company Name</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="companyname"
								value="${product.companyname}" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-3">Price</label>
						<div class="col-md-7">
							<input type="number" class="form-control" name="price"
								value="${product.price}" />
						</div>
					</div>

					<div class="form-group ">
						<label class="col-md-3"></label>
						<div class="col-md-7">
							<input type="submit" class="btn btn-primary" value="ADD" />
						</div>
					</div>
				</form>
			</div>
		</c:when>

		<c:when test="${mode=='ALL_PRODUCT'}">
			<div class="container text-center" id="tasksDiv">
				<h3>All Products</h3>
				<hr>
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Product ID</th>
								<th>Product Name</th>
								<th>Product Type</th>
								<th>Company Name</th>
								<th>Price</th>
								<th>Delete</th>
								<th>Edit</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="product" items="${products}">
								<tr>
									<td>${product.productid}</td>
									<td>${product.productname}</td>
									<td>${product.producttype}</td>
									<td>${product.companyname}</td>
									<td>${product.price}</td>
									<td><a
										href="/delete-product?productid=${product.productid}"><span
											class="glyphicon glyphicon-trash"></span></a></td>
									<td><a href="/edit-product?productid=${product.productid}"><span
											class="glyphicon glyphicon-pencil"></span></a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</c:when>


		<c:when test="${mode=='MODE_ADD_SUPPLIER'}">
			<div class="container">
				<h3>New Supplier</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="save-supplier">
					<div class="form-group">
						<label class="col-md-3">Supplier name</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="suppliername"
								value="${supplier.suppliername}" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-3">Supplier Phone</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="supplierphone"
								value="${supplier.supplierphone}" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-3">Supplier Address</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="supplieraddress"
								value="${supplier.supplieraddress}" />
						</div>
					</div>

					<div class="form-group ">
						<label class="col-md-3"></label>
						<div class="col-md-7">
							<input type="submit" class="btn btn-primary" value="ADD Supplier" />
						</div>
					</div>

				</form>
			</div>
		</c:when>

		<c:when test="${mode=='MODE_UPDATE_SUPPLIER'}">
			<div class="container">
				<h3>Update Supplier</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="save-supplier">
					<div class="form-group">
						<label class="col-md-3">Supplier name</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="suppliername"
								value="${supplier.suppliername}" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-3">Supplier Phone</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="supplierphone"
								value="${supplier.supplierphone}" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-3">Supplier Address</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="supplieraddress"
								value="${supplier.supplieraddress}" />
						</div>
					</div>

					<div class="form-group ">
						<label class="col-md-3"></label>
						<div class="col-md-7">
							<input type="submit" class="btn btn-primary" value="ADD Supplier" />
						</div>
					</div>

				</form>
			</div>
		</c:when>

		<c:when test="${mode=='ALL_SUPPLIERS'}">
			<div class="container text-center" id="tasksDiv">
				<h3>All Suppliers</h3>
				<hr>
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Supplier Name</th>
								<th>Supplier phone</th>
								<th>Supplier Address</th>
								<th>Delete</th>
								<th>Edit</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="supplier" items="${suppliers}">
								<tr>
									<td>${supplier.suppliername}</td>
									<td>${supplier.supplierphone}</td>
									<td>${supplier.supplieraddress}</td>
									<td><a
										href="/delete-supplier?supplierphone=${supplier.supplierphone}"><span
											class="glyphicon glyphicon-trash"></span></a></td>
									<td><a
										href="/edit-supplier?supplierphone=${supplier.supplierphone}"><span
											class="glyphicon glyphicon-pencil"></span></a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</c:when>
	</c:choose>

</body>
</html>