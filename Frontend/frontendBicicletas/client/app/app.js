'use strict';

angular.module('paraisoBicicletasApp', [
  'paraisoBicicletasApp.constants',
  'ngCookies',
  'ngResource',
  'ngSanitize',
  'ui.router',
  'ui.bootstrap'
])
  .constant('API',"http://10.72.197.160:8080/ParaisoCiclistaBackend/api")
  .config(function($urlRouterProvider, $locationProvider) {
    $urlRouterProvider
      .otherwise('/');

    $locationProvider.html5Mode(true);
  });
