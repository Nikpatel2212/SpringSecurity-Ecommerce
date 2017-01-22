<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>


<br/>
<div class="container">
<div class="row">
  <div class="col-sm-6"><h3><b>Check The Details</b></h3></div>
  <div class="col-sm-6"><button type="button" class="btn btn-default"><a href="clientHome">Home</a></button></div>
</div>
<br/>
<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>User Name</th>
					<th>University Name</th>
				</tr>
			</thead>
			<c:forEach var="studentList" items="${studentDetails}">
			<tbody>
				<tr>
					<td>${studentList.id}</td>
					<td>${studentList.fname}</td> 
					<td>${studentList.lname}</td>
					<td>${studentList.universityName}</td>
				</tr>
			</tbody>
			</c:forEach>
	</table>
</div>
</body>
</html>