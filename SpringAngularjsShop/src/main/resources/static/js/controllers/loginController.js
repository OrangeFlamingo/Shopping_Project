sampleApp.controller('loginController', function($scope, $http, $location) {
	$scope.login = function() {
    var result = $http({
      method : 'POST',
      url : '/api/login',
      data: $.param({
            userId: $scope.userId,
            userPassword: $scope.userPassword
        }),
        headers: {
            'Content-Type': 'application/x-www-form-urlencoded; charset=UTF-8'
        }
    }).success(function(data) {
      $scope.result = data.message;
      alert($scope.result);
      $location.url('/main')
    }).error(function(data, status, headers, config) {
      alert('error : status[' + status + ']');
    });
      
  }

	$scope.goPage = function() {
		$location.url('/result')
	}
	
});
