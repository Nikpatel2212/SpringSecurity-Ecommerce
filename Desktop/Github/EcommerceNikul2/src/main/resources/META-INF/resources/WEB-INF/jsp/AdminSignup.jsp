<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- <html ng-app="myApp.Ecommerce"> -->
<<html>
<head>
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Shoppy Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<link href="Admincss/bootstrap.css" rel="stylesheet" type="text/css" media="all">
<!-- Custom Theme files -->
<link href="Admincss/style.css" rel="stylesheet" type="text/css" media="all"/>
<!--js-->
<script src="Adminjs/jquery-2.1.1.min.js"></script> 
<!--icons-css-->
<link href="Admincss/font-awesome.css" rel="stylesheet">
<!--Google Fonts-->
<link href='//fonts.googleapis.com/css?family=Carrois+Gothic' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Work+Sans:400,500,600' rel='stylesheet' type='text/css'>
<!--//js for inserting data-->
<script src="https://code.angularjs.org/1.3.9/angular.js"></script>
<script src="https://code.angularjs.org/1.3.9/angular-resource.js"></script>
<!-- <script src="WorkingJS/EcommerceJS.js"></script> -->
<!-- <script src="WorkingJS/EcommAdminController.js"></script> -->
<!-- <script src="WorkingJS/EcommReg.js"></script>
<script src="WorkingJS/checklist-model.js"></script> -->

<!--//charts-->
</head>
<!-- <body ng-controller="EcommASignupController"> -->
<body> 
<!--inner block start here-->
<div class="signup-page-main">
     <div class="signup-main">  	
    	 <div class="signup-head" style="background-color: buttonshadow;">
				<h1>Sign Up</h1>
			</div>
			<div class="signup-block">
				
				
				
				
				
				<form:form  modelAttribute="AdminSignUp" action="EmpRegistration" method="post">
					<form:input type="hidden" path="id" id="id"/>
					<form:input type="text" path="Aname" placeholder="Name" required="" />
					<form:input type="text" path="email" placeholder="Email" required="" />
					
					<form:input type="hidden" path="enabled" id="enabled" value="true"/>
					
					<!-- <input type="checkbox" checklist-model="role1" checklist-value="roleA">A
					<input type="checkbox" checklist-model="role1" checklist-value="roleB">B
					<label ng-repeat="role in roles">
 					<input type="checkbox" checklist-model="user.roles" checklist-value="role"> {{role}}
					</label> -->
					
					<%-- <form:select path="roles" items="${roles}" multiple="true" itemValue="id" itemLabel="type" /> --%>
					
					
					 <form:checkbox path="roles" items="Admin" value="Admin" itemValue="id" />Admin
                     <form:checkbox path="roles" items="EmpA"  value="EmpA" itemValue="id"/>Employee-A
                     <form:checkbox path="roles" items="EmpB"  value="EmpB" itemValue="id"/>Employee-B
					
					<%-- <form:select path="roles" multiple="true">
 						<form:option value="volvo">Volvo</form:option>
  						<form:option value="saab">Saab</form:option>
  						<form:option value="opel">Opel</form:option>
  						<form:option value="audi">Audi</form:option>
					</form:select> --%>
					
					
					<form:input type="text" path="username" placeholder="Username" required="" />
					<form:input type="password" path="password" class="lock" placeholder="Password"/>
					<form:input type="password" path="cpassword" class="lock" placeholder="Confirm Password"/>
					
					
					<div class="forgot-top-grids">
						<div class="forgot-grid">
							<ul>
								<li>
									<input type="checkbox" id="brand1" value="">
									<label for="brand1"><span></span>I agree to the terms</label>
								</li>
							</ul>
						</div>
						
						<div class="clearfix"> </div>
					</div>
					<input type="submit" name="Sign In" value="Sign up" >														
				</form:form> 
				
				
				
			
				
				<%-- 
				<form action="#" method="post">
					<input type="hidden" name="id" ng-model="id"/>
					<input type="text" name="name" placeholder="Name" required="" ng-model="aNAME"/>
					<input type="text" name="email" placeholder="Email" required="" ng-model="aEMAIL"/>
					<!-- <input type="checkbox" checklist-model="role1" checklist-value="roleA">A
					<input type="checkbox" checklist-model="role1" checklist-value="roleB">B -->
					<label ng-repeat="role in roles">
 					<input type="checkbox" checklist-model="user.roles" checklist-value="role"> {{role}}
					</label>
					<input type="text" name="username" placeholder="Username" required="" ng-model="aUSERNAME"/>
					<input type="password" name="password" class="lock" placeholder="Password" ng-model="aPASSWORD"/>
					<input type="password" name="cpassword" class="lock" placeholder="Confirm Password" ng-model="cPASSWORD"/>
					<div class="forgot-top-grids">
						<div class="forgot-grid">
							<ul>
								<li>
									<input type="checkbox" id="brand1" value="">
									<label for="brand1"><span></span>I agree to the terms</label>
								</li>
							</ul>
						</div>
						
						<div class="clearfix"> </div>
					</div>
					<input type="submit" name="Sign In" value="Sign up" ng-click="ainsert()" ng-enter="ainsert()">														
				</form>
				 --%>
				
				
				
				
				<div class="sign-down">
				<h4>Already have an account? <a href="login.html"><u> Login here. </u></a></h4>
				  <!-- <h5><a href="index.html">Go Back to Home</a></h5> -->
				</div>
			</div>
    </div>
</div>
<!--inner block end here-->
<!--copy rights start here-->
<div class="copyrights">
	 <p>© 2016 Shoppy. All Rights Reserved | Design by  <a href="http://w3layouts.com/" target="_blank">W3layouts</a> </p>
</div>	
<!--COPY rights end here-->
<!--scrolling js-->
		<script src="Adminjs/jquery.nicescroll.js"></script>
		<script src="Adminjs/scripts.js"></script>
		<!--//scrolling js-->
<script src="Adminjs/bootstrap.js"> </script>
<!-- mother grid end here-->
</body>
</html>