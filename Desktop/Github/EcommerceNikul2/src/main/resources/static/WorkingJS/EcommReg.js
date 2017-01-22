/**
 * 
 */

var abc =angular.module('myApp.Ecommerce', ['ngResource', "checklist-model"] );


abc.factory('AdminSignup', function($resource) {
  return $resource('/EmpRegistration');
})

.controller('EcommASignupController', function($scope, AdminSignup) {
	alert("d");
	$scope.roles = [
	    'ADMIN', 
	    'EMPLOYEE-A', 
	    'EMPLOYEE-B', 
	    'EMPLOYEE-c'
	  ];
	  $scope.user = {
	    roles: ['EMPLOYEE-A']
	  };
	
	$scope.ainsert = function() {
		alert("a");
		var AdminSignup = new AdminSignup();
		AdminSignup.id=$scope.id,
		AdminSignup.username= $scope.aUSERNAME;
        AdminSignup.email= $scope.aEMAIL;
        AdminSignup.password= $scope.aPASSWORD;
        AdminSignup.enabled=true;
        AdminSignup.Aname= $scope.aNAME;
        AdminSignup.roles= $scope.user.roles;
        AdminSignup.cpassword=$scope.cPASSWORD
        alert("c");
		AdminSignup.$save('/EmpRegistration',function() {
			alert("b");
		
		 });
		
		
//		
//		alert($scope.aUSERNAME);
//		alert($scope.user.roles);
//		 var details = {
//	                username: $scope.aUSERNAME,
//	                email: $scope.aEMAIL,
//	                password: $scope.aPASSWORD,
//	                enabled:true,
//	                Aname: $scope.aNAME,
//	                roles: $scope.user.roles
//	            }
//
//		 $http({
//			 method: 'POST',
//			 url: '/EmpRegistration',
//			 params:details,
//			 
//			 headers: {'Content-Type': 'application/x-www-form-urlencoded'}
//		 
//			 }).success(function(data) {
//		        	alert("Account Created");
//		            $scope.user = data;
		       
		
}
	
});