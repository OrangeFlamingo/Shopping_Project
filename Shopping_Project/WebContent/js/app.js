var myApp = angular.module();

myApp.config(function($routeProvider) {
	$routeProvider

	.when('/', 
		{templateUrl: 'views/index.html', controller: 'IndexController'}
	)

	.when('/p_list', 
		{templateUrl: 'views/product_list.html', controller: 'p_listController'}
	)

	.when('/reserv', 
		{templateUrl: 'views/userJoin.html', controller: 'reservController'}
	)

	.when('/p_detail', 
		{templateUrl: 'views/product_detail.html', controller: 'p_detailController'}
	)

	.when('/p_rewrite',
		{templateUrl: 'views/Product_Rewrite.html', controller: 'p_rewriteController'}
	)
	
	.when('/cart',
		{templateUrl: 'views/cart.html', controller: 'cartController'}
	)

	.when('/o_list',
		{templateUrl: 'views/orderlist.html', controller: 'o_listController'}
	)

	.when('o_success',
		{templateUrl: 'views/orderSuccess.html', controller: 'o_successController'}
	)

	.when('/u_info',
		{templateUrl: 'views/userInfo.html', controller: 'u_infoController'}
	)

	.when('/u_rewrite',
		{templateUrl: 'views/userInfoRewrite.html', controller: 'u_rewriteController'}
	)

});

myApp.config(['$locationProvider', function($locationProvider) {
	return $locationProvider.htmlSMode({
		enable: true, requireBase: false
	});
}]);

myApp.config(['$httpProvider', function($httpProvider){
	if(!$httpProvider.defaults.headers.get) {
		$httpProvider.defaults.headers.get = {};
	}

	 $httpProvider.defaults.headers.get['If-Modified-Since'] = 'Mon, 26 Jul 1997 05:00:00 GMT';
    $httpProvider.defaults.headers.get['Cache-Control'] = 'no-cache';
    $httpProvider.defaults.headers.get['Pragma'] = 'no-cache';
}]);
