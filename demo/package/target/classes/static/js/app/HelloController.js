'use strict';
angular.module('demo')
    .controller('HelloController', ['$scope', 'HelloService','Hello',
    function($scope,HelloService,Hello) {
        $scope.hello = {
            message:'_',
            sampleJson:{}
        };
        $scope.testHello = function() {

            HelloService.getHello().then(function (success) {
                console.debug("success"+success.data);
                $scope.hello.message=success.data;
            },function (failed) {
                console.error("failed"+failed.data);
                $scope.hello.message="error "+failed.data;
            })
        };

        $scope.getSample = function(){
            Hello.sample.query(function(response){
                $scope.hello.sampleJson=response;
            },function(failed){
                $scope.hello.sampleJson=failed;
            })
        }
        $scope.getFresques = function(){
               HelloService.getFresques().then(function (success) {
                               console.debug("success"+success.data);
                               $scope.hello.fresquesJson=success.data;
                           },function (failed) {
                               console.error("failed"+failed.data);
                               $scope.hello.fresquesJson="error "+failed.data;
                           })
        }
        $scope.getFresquesTable = function(){
                        HelloService.getFresques().then(function (success) {
                                                       console.debug("success"+success.data);
                                                       var list =JSON.parse(success.data);
                                                       var cols = [];

                                                                                   for (var i = 0; i < list.length; i++) {
                                                                                       for (var k in list[i]) {
                                                                                           if (cols.indexOf(k) === -1) {

                                                                                               // Push all keys to the array
                                                                                               cols.push(k);
                                                                                           }
                                                                                       }
                                                                                   }

                                                                                   // Create a table element
                                                                                   var table = document.createElement("table");

                                                                                   // Create table row tr element of a table
                                                                                   var tr = table.insertRow(-1);

                                                                                   for (var i = 1; i < cols.length; i++) {
                                                                                        if(j==0 || j==11 | j==12){
                                                                                           // Create the table header th element
                                                                                           var theader = document.createElement("th");
                                                                                           theader.innerHTML = cols[i];

                                                                                           // Append columnName to the table row
                                                                                           tr.appendChild(theader);
                                                                                           }
                                                                                   }

                                                                                   // Adding the data to the table
                                                                                   for (var i = 0; i < list.length; i++) {

                                                                                       // Create a new row
                                                                                       var trow = table.insertRow(-1);
                                                                                       for (var j = 0; j < cols.length; j++) {
                                                                                       if(j==0 || j==11 | j==12){
                                                                                               var cell = trow.insertCell(-1);

                                                                                               // Inserting the cell at particular place
                                                                                               cell.innerHTML = list[i][cols[j]];
                                                                                               }

                                                                                       }
                                                                                   }

                                                                                   // Add the newely created table containing json data
                                                                                   var el = document.getElementById("table");
                                                                                   el.innerHTML = "";
                                                                                   el.appendChild(table);
                                                   },function (failed) {
                                                       console.error("failed"+failed.data);
                                                   })




        }

    }
]);
