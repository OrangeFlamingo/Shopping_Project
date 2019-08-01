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
	
	$scope.click = function() {
		var message = $scope.selectTest.code;
		var result = $http({
	    method : 'POST',
	    url : '/api/product',
	    data: $.param({
	          productCd: $scope.text1,
	          param2: 'parameter 2'
	      }),
	      headers: {
	          'Content-Type': 'application/x-www-form-urlencoded; charset=UTF-8'
	      }
	  }).success(function(data) {
	    $scope.result = "상품명 : " + data.productName + ", 가격 : " + data.price + ", 재고수 : " + data.stock;
	  }).error(function(data, status, headers, config) {
	    alert('error : status[' + status + ']');
	  });
	    
	}

	$scope.goPage = function() {
		$location.url('/result')
	}

	
});
