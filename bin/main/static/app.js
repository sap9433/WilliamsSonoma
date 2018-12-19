var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope, $http){
    $http.get("/api/products/all")
    .then(function(response) {
        $scope.products = response.data.groups;
    });
});