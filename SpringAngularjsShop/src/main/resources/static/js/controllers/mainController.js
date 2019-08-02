sampleApp.controller('mainController', function($scope, $http, $location) {

	$scope.$on('$viewContentLoaded', function() {  
            $scope.fnSearch(); 
        }); 

	$scope.fnSearch = function() {
		var result = $http({
	    method : 'GET',
	    url : '/products'
	  }).success(function(data) {
		$scope.productList = data;
	
	  }).error(function(data, status, headers, config) {
	    alert('error : status[' + status + ']');
	  });
	    
	}

	$scope.selectboxList = [
           {name:'option1',code:'value1'},
           {name:'option2',code:'value2'},
           {name:'option3',code:'value3'}
       ];
	
	// default selected
	$scope.selectTest = $scope.selectboxList[0];
	
   	$scope.selectOption = function () {
   		alert($scope.selectTest.name + " : " + $scope.selectTest.code);
   	};
	
   	$scope.text1 = 'input value';
   	
	$scope.$watch('text1', function(newValue, oldValue) {
//		alert('old value : ' + oldValue);
//		alert('new value : ' + newValue);
	}, true);
	
	$scope.detail = function(productCd) {
		$location.url('/detail?productCd=' + productCd);	    
	}

	$scope.goPage = function() {
		$location.url('/result')
	}

	
});
