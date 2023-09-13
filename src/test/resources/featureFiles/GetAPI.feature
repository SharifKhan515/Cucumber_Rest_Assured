Feature: Verify All the Get API endpoint of https://automationexercise.com/api/


  Scenario:Verify productsList Get endpoint is returning a product list
    When Get call to "productsList" API
    Then Response code is 200
    And Response body contains "Product" List

  Scenario:Verify brandsList Get endpoint is returning a brand list
    When Get call to "brandsList" API
    Then Response code is 200
    And Response body contains "Brand" List
