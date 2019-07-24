sampleApp.controller('resultController', function($scope, $http, $location) {

	var result = $http({
		method : 'POST',
		url : '/api/test-db',
		data: $.param({
	        param1: 'parameter 1',
	        param2: 'parameter 2'
	    }),
	    headers: {
	        'Content-Type': 'application/x-www-form-urlencoded; charset=UTF-8'
	    }
	}).success(function(data) {
		$scope.result = data.message;
	}).error(function(data, status, headers, config) {
		alert('error : status[' + status + ']');
	});
		
	
	$scope.goMain = function() {
		$location.url('/main')
	}
});
