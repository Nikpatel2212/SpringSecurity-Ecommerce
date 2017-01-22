<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"></meta>
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"></link>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<!-- <script src="AngConsume.js"></script> -->

<style>
	table, th, td {
		border: 1px solid black;
		border-spacing: 0px;
		}
	th, td {
		padding: 10px;
		}
</style>
</head>
<body>

<div class="container">
<div class="jumbotron">

<h1>Home Page</h1>
<br/>

<h3>Get all data:</h3>
<div>
<a href="FindByJersey"><u>Find By Jersey</u></a><br/>
<a href="FindBySpring"><u>Find By Spring</u></a><br/>
<a href="FindByAngular"><u>Find By AngularJS</u></a>
</div>
<br/>

<h3>Get Specific User Data:</h3>
<div> 
<button type="button" class="btn btn-success" data-toggle="modal" data-target="#demo1">Get</button>
</div>
<br/>

<h3>Create New User:</h3>
<div> 
<button type="button" class="btn btn-success" data-toggle="modal" data-target="#demo2">Create</button>
</div>
<br/>

<h3>Delete Specific User:</h3>
<div> 
<button type="button" class="btn btn-success" data-toggle="modal" data-target="#demo3">Delete</button>
</div>
<br/>


  <!-- Modal -->
  <div class="modal fade" id="demo1" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Get Data</h4>
        </div>
        <div class="modal-body">
          <form action="/findStudentById">
			ID : <input type="text" class="form-control" name="id" /><br />
			<input type="submit" />
		  </form>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
  
  <!-- Modal -->
  <div class="modal fade" id="demo2" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Get Data</h4>
        </div>
        <div class="modal-body">
          <form action="/createProfile" method="Post">
			First name : <input type="text" class="form-control" name="fname" /><br />
			Last name : <input type="text" class="form-control" name="lname" /><br />
			University name : <input type="text" class="form-control" name="universityName" /><br />
			<input type="submit" />
		  </form>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
  
  <!-- Modal -->
  <div class="modal fade" id="demo3" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Delete User Data</h4>
        </div>
        <div class="modal-body">
          <form action="/deleteStudentById">
			ID : <input type="text" class="form-control" name="id" /><br />
			<input type="submit" />
		  </form>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>

</div>
</div>

<br/>


</body>
</html>