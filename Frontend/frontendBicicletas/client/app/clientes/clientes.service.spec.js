'use strict';

describe('Service: clientes', function () {

  // load the service's module
  beforeEach(module('paraisoBicicletasApp'));

  // instantiate service
  var clientes;
  beforeEach(inject(function (_clientes_) {
    clientes = _clientes_;
  }));

  it('should do something', function () {
    expect(!!clientes).to.be.true;
  });

});
