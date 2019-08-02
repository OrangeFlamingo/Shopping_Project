sampleApp.controller('reservationController', function($scope, $http, $location) {
	$scope.add = function() {

    var result = $http({
      method : 'POST',
      url : '/user/reservation',
      data: $.param({
            userId: $scope.reg_userid,
			userPassword: $scope.reg_password,
			userName: $scope.reg_name,
			userNum: $scope.reg_phone,
			address: $scope.reg_address
        }),
        headers: {
            'Content-Type': 'application/x-www-form-urlencoded; charset=UTF-8'
        }
    }).success(function(data) {
      $scope.result = data.userName;
      alert('가입되었습니다.');
      $location.url('/')
    }).error(function(data, status, headers, config) {
      alert('error : status[' + status + ']');
    });
      
  }

	$scope.goPage = function() {
		$location.url('/result')
	}
	
});
