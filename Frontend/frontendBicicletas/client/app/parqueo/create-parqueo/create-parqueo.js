'use strict';

angular.module('paraisoBicicletasApp')
  .config(function ($stateProvider) {
    $stateProvider
      .state('create-parqueo', {
        url: '/create-parqueo',
        template: '<create-parqueo></create-parqueo>'
      });
  });
