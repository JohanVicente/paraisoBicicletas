'use strict';

describe('Service: parqueo', function () {

  // load the service's module
  beforeEach(module('paraisoBicicletasApp'));

  // instantiate service
  var parqueo;
  beforeEach(inject(function (_parqueo_) {
    parqueo = _parqueo_;
  }));

  it('should do something', function () {
    expect(!!parqueo).to.be.true;
  });

});
