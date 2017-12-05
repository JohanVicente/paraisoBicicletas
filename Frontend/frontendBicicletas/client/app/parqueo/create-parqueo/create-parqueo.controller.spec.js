'use strict';

describe('Component: CreateParqueoComponent', function () {

  // load the controller's module
  beforeEach(module('paraisoBicicletasApp'));

  var CreateParqueoComponent, scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($componentController, $rootScope) {
    scope = $rootScope.$new();
    CreateParqueoComponent = $componentController('CreateParqueoComponent', {
      $scope: scope
    });
  }));

  it('should ...', function () {
    expect(1).to.equal(1);
  });
});
