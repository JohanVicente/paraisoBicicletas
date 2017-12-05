'use strict';

(function() {

class MainController {

  constructor(parqueoService) {
    this.parqueoService = parqueoService;
  }

  $onInit() {
    this.$http.get('/api/things').then(response => {
      this.awesomeThings = response.data;
    });
  }
}

angular.module('paraisoBicicletasApp')
  .component('main', {
    templateUrl: 'app/main/main.html',
    controller: MainController,
    controllerAs:'vm'
  });

})();
