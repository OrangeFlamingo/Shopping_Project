var sampleApp = angular.module('sampleApp', ['ngRoute']);

sampleApp.config(function ($routeProvider) {
	$routeProvider
	
	.when('/'
		  , {templateUrl: 'views/login.html', controller: 'loginController'}
	)
  
	.when('/main'
		  , {templateUrl: 'views/main.html', controller: 'mainController'}
	)

	.when('/result'
		  , {templateUrl: 'views/result.html', controller: 'resultController'}
	)

/** 	.when('/carts'
		, {templateUrl: 'views/carts.html', controller: 'cartController'}
	)

	.when('/order'
		, {templateUrl: 'views/orderResult.html', controller: 'orderController'}
	)

	.when('/finishOrder'
		, {templateUrl: 'views/finishOrder.html', controller: 'orderController'}
	)
*/
	.otherwise({redirectTo: '/main'});
  
});

sampleApp.config(['$locationProvider', function ($locationProvider) {
    return $locationProvider.html5Mode({
        enabled: true,
        requireBase: false
    });
}]);

sampleApp.config(['$httpProvider', function($httpProvider) {
    //initialize get if not there
    if (!$httpProvider.defaults.headers.get) {
        $httpProvider.defaults.headers.get = {};    
    }    

    // Answer edited to include suggestions from comments
    // because previous version of code introduced browser-related errors

    //disable IE ajax request caching
    $httpProvider.defaults.headers.get['If-Modified-Since'] = 'Mon, 26 Jul 1997 05:00:00 GMT';
    // extra
    $httpProvider.defaults.headers.get['Cache-Control'] = 'no-cache';
    $httpProvider.defaults.headers.get['Pragma'] = 'no-cache';
}]);
