'use strict';

class NavbarController {

  constructor() {
    }
    mostrar(){
     $('.navbar-collapse').collapse('hide');
   }
}

angular.module('paraisoBicicletasApp')
  .controller('NavbarController', NavbarController);
