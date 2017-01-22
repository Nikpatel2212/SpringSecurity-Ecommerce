<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script type="text/javascript">
var my_app = angular.module('my_app', []);

my_app.controller('my_cntrl', function($scope, $http) {
	
    $http.get('http://localhost:8443/rest/JerseyStudents/profile').success(function(data){
   		console.log(data);
        $scope.usr=data; 
        
    }); 
});

</script>

</head>
<body>


<!-- Due to No 'Access-Control-Allow-Origin' (CORS) mean browser is blocking for security reason-->
 
 
<div ng-app="my_app">
<div ng-controller="my_cntrl">
    <div style="padding: 50px">
 		<table class="table table-striped table-bordered" >
    		<tr class="info">
     			<th>firstName </th>
     			<th>LastName</th>
        		<th>University Name</th>
       		</tr>
    		<tr ng-repeat="user in usr">
        		<td>{{user.fname}}</td>
        		<td>{{user.lname}}</td>     
        		<td>{{user.universityName}}</td>
    		</tr>
    	</table>
	</div>      
</div> 
</div>
    

</body>
</html>