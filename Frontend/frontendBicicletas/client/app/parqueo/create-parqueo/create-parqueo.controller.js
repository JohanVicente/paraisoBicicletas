'use strict';
(function(){

class CreateParqueoComponent {
  constructor(parqueoService, clientesService) {
    this.parqueoService = parqueoService;
    this.clientesService = clientesService;
    this.horaNew = 0;
  }

  $onInit(){
    this.clientesService.query().$promise
    .then(response =>{
      this.clientes = response;
    })
    .catch(err =>{
      console.log(err);
    })
  }

  createParqueo(){
  	this.parqueoService.save(this.parqueo).$promise
  	.then(response => {
  		console.log("Parqueo se  crea exitosamente ",response);

      if (this.horas <= 3) {
        this.precio = 2000;
        this.precio = this.precio * this.horas;
      }else if(this.hora <= 5){
        this.precio = 1500;
        this.horaNew = this.horas -3;
        this.precio = 3 * this.precio + this.horaNew * this.precio;
      }else if (this.horas > 5) {
        this.precio = 1500;
        this.horaNew = this.horas -5;
        this.precio = 3 * this.precio + this.horaNew * this.precio;
        this.precio = this.precio - (this.precio * 0.05); 
      }

  	})
  	.catch(err=>{
  		console.log("Error al crear el parqueo ",err);
      // this.$state.go('usuarios-list');
  	})
  }


  /*getParqueo(){
    this.parqueoService.getParqueo(this.}).$promise
    .then(response =>{
      this.parqueo = response;
    })
    .catch(err =>{
      console.log(err);
    })

  }*/



}


angular.module('paraisoBicicletasApp')
  .component('createParqueo', {
    templateUrl: 'app/parqueo/create-parqueo/create-parqueo.html',
    controller: CreateParqueoComponent,
    controllerAs:'vm'
  });

})();
