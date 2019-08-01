sampleApp.controller('loginController', function($scope, $http, $location) {
	$scope.login = function() {
		var result = $http({
		method : 'POST',
		url : '/login',
		data: $.param({
				userId: $scope.userId,
				userPassword: $scope.userPassword
			}),
			headers: {
				'Content-Type': 'application/x-www-form-urlencoded; charset=UTF-8'
			}
		}).success(function(data) {
		//$scope.result = data.userName;
		alert(data.userName);
		if (data.userName) {
			$location.url('/main')
		} else {
			alert('ID 혹은 패스워드가 잘못되었습니다.');
		}
		}).error(function(data, status, headers, config) {
		alert('error : status[' + status + ']');
		});
      
  	}

	$scope.goPage = function() {
		$location.url('/result')
	}

	$scope.goReservation = function() {
		$location.url('/reserve')
	}

});
