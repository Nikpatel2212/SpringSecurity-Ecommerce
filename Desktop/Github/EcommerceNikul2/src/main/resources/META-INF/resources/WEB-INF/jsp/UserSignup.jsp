<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="myApp.Ecommerce">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Smart Bazaar Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
SmartPhone Compatible web template, free WebDesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Custom Theme files -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" /> 
<link href="css/menu.css" rel="stylesheet" type="text/css" media="all" /> <!-- menu style --> 
<link href="css/ken-burns.css" rel="stylesheet" type="text/css" media="all" /> <!-- banner slider --> 
<link href="css/animate.min.css" rel="stylesheet" type="text/css" media="all" /> 
<link href="css/owl.carousel.css" rel="stylesheet" type="text/css" media="all"> <!-- carousel slider -->  
<!-- //Custom Theme files -->
<!-- font-awesome icons -->
<link href="css/font-awesome.css" rel="stylesheet"> 
<!-- //font-awesome icons -->
<!-- js -->
<script src="js/jquery-2.2.3.min.js"></script> 
<!-- //js --> 
<!-- web-fonts -->
<link href='//fonts.googleapis.com/css?family=Roboto+Condensed:400,300,300italic,400italic,700,700italic' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Lovers+Quarrel' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Offside' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Tangerine:400,700' rel='stylesheet' type='text/css'>
<!-- web-fonts --> 
<script src="js/owl.carousel.js"></script>
<script src="js/UpScript.js"></script>  

<script src="js/jquery-scrolltofixed-min.js" type="text/javascript"></script>

<!-- start-smooth-scrolling -->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>	

<!-- //end-smooth-scrolling -->
<!-- smooth-scrolling-of-move-up -->
<!-- //smooth-scrolling-of-move-up -->
<script src="js/bootstrap.js"></script>	
<title>Insert title here</title>
<script src="https://code.angularjs.org/1.3.9/angular.js"></script>
<script src="https://code.angularjs.org/1.3.9/angular-resource.js"></script>
<script src="WorkingJS/EcommerceJS.js"></script>
<script src="WorkingJS/EcommController.js"></script>
</head>
<body ng-controller="ESignController">

<jsp:include page="/MainPages/EcommerceHeader.jsp"></jsp:include>
<jsp:include page="/MainPages/EcommerceCat.jsp"></jsp:include>

<!-- sign up-page -->
	<div class="login-page">
		<div class="container"> 
			<h3 class="w3ls-title w3ls-title1">Create your account</h3>  
			<div class="login-body">
				<form action="#" method="post">
					<input type="text" class="user" name="name" placeholder="Enter your Name" required="" ng-model="NAME">
					<input type="text" class="user" name="username" placeholder="Enter your Username" required="" ng-model="USERNAME">
					<input type="email" class="user" name="email" placeholder="Enter your email" required="" ng-model="EMAIL">
					<input type="password" name="password" class="lock" placeholder="Password" required="" ng-model="PASSWORD">
					<input type="password" name="cpassword" class="lock" placeholder="Confirm Password" required="" ng-model="CPASSWORD">
					<input type="submit" value="Sign Up" ng-click="insert()" ng-enter="insert()">
					<div class="forgot-grid">
						<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Remember me</label>
						<div class="forgot">
							<a href="#">Forgot Password?</a>
						</div>
						<div class="clearfix"> </div>
					</div>
					<h6>Already have an account? <a href="login1">Login Now »</a> </h6> 
				</form>
			</div>  
			 
		</div>
	</div>
	<!-- //sign up-page -->
	
<jsp:include page="/MainPages/EcommerceFooter.jsp"></jsp:include>
 
<!-- cart-js -->
	<script src="js/minicart.js"></script>
	<script src="js/Bottom.js"></script>
	<!-- //cart-js -->	
	<!-- countdown.js -->	
	<script src="js/jquery.knob.js"></script>
	<script src="js/jquery.throttle.js"></script>
	<script src="js/jquery.classycountdown.js"></script>
		
	<!-- //countdown.js -->
	<!-- menu js aim -->
	<script src="js/jquery.menu-aim.js"> </script>
	<script src="js/main.js"></script> <!-- Resource jQuery -->
	<!-- //menu js aim --> 
	
</body>
</html>