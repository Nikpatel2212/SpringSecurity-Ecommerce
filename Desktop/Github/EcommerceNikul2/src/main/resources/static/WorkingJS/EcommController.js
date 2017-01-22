/**
 * 
 */

angular.module('myApp.Ecommerce').controller('ESignController', function($scope, $http) {
	
	
	$scope.insert = function() {
		
		 var details = {
	                username: $scope.USERNAME,
	                email: $scope.EMAIL,
	                password: $scope.PASSWORD,
	                firstName: $scope.NAME,
	            }
//		 var a = "${_csrf.parameterName}";
//	     var b = "${_csrf.token}";
		 $http({
			 method: 'POST',
			 url: '/newUser',
			 params:details,
//			 transformRequest: function(){return a+"="+b;},
			 headers: {'Content-Type': 'application/x-www-form-urlencoded'}
		 
			 }).success(function(data) {
		        	alert("Account Created");
		            $scope.user = data;
		        });
		 
		 
//    $http.post('/newUser',{params:details}).
//        success(function(data) {
//        	alert("hiii7777");
//            $scope.user = data;
//        });
}
	
});