Feature: Verify All the Get API endpoint of https://automationexercise.com/api/
  Scenario:Verify productList Get endpoint is returning a product list
    When Get call to "productsList" API
    Then Response code is 200
    And Response body contains Product List
