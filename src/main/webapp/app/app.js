var app = angular.module('app', [ 'ngRoute' ,'chart.js']);
app.config(function($routeProvider, $locationProvider) {
	// remove o # da url
	$locationProvider.html5Mode(true);
	$routeProvider
	// para a rota '/', carregaremos o template home.html e o controller 'HomeCtrl'
	.when('/', {
		templateUrl : 'app/views/home.html',
		controller : 'HomeController',
	})
	// caso não seja nenhum desses, redirecione para a rota '/'
	.otherwise({
		redirectTo : '/'
	});
});