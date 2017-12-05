'use strict';

function clientesService(API,$resource){
	return $resource(API+'/cliente/:id',{
		id:'@id'
	},{
		update:{
			method:'PUT'
		}
	});
}
angular.module('paraisoBicicletasApp')
  .factory('clientesService',clientesService);
