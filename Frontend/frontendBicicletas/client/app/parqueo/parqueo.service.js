'use strict';

function parqueoService(API,$resource){
	return $resource(API+'/parqueo',{
		update:{
			method:'PUT'
		},
    getParqueo:{
      url:API+'/parqueo/find',
      method: 'GET',
      isArray:true
    }
	});
}
angular.module('paraisoBicicletasApp')
  .service('parqueoService', parqueoService);
