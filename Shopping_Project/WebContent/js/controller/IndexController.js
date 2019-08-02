myApp.controller('IndexController', function($scope, $http, $location){
	$scocpe.inputId = function() {
			var result = $http({
				method : 'POST',
				url : '//',
				data : $.param({
					inputId : $scope.inputId,
					inputpasswd : $scope.inputpasswd
				}),
				
			headers : {
				'Content-Type' : 'application/x-ww-form-urlencoded; charset=UTF-8'
			}
		}).success(function(data) {
			$location.url('/p_list')
		}).error(function(data, status, headers, config){
			alert('error : status [' + status + ']');
		});
		
	}

	$scope.goPage = function(){
		$location.url('')
	}

});