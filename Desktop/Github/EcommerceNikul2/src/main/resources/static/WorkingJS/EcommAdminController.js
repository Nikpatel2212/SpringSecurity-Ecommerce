/**
 * 
 */

angular.module('myApp.Ecommerce', ["checklist-model"] ).controller('EcommASignupController', function($scope, $http) {
	
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
		alert($scope.aUSERNAME);
		alert($scope.user.roles);
		 var details = {
	                id:$scope.id,
				 	username: $scope.aUSERNAME,
	                email: $scope.aEMAIL,
	                password: $scope.aPASSWORD,
	                enabled:true,
	                Aname: $scope.aNAME,
	                roles: $scope.user.roles,
	                cpassword:$scope.cPASSWORD
	            }

		 $http({
			 method: 'POST',
			 url: '/EmpRegistration',
			 params:details,
			 
			 headers: {'Content-Type': 'application/x-www-form-urlencoded'}
		 
			 }).success(function(data) {
		        	alert("Account Created");
		            $scope.user = data;
		        });
		
}
	
});