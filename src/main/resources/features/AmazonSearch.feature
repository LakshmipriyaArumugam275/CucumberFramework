@Complete
Feature: Amazon Search product

  Scenario: Amazon product search hard coding value from Coding.
  Given User should navigate to Amazon Home page
 
  @Smoke
  Scenario Outline: Amazon product search with multiple values are hard coding from feature file using scenario outline
  When Enter the multiple product name as <ProductName> and multiple product catagory as <ProductCatagory>
  And Click on submit button
  Then Validate the search result
  And Close the Browser
  
  Examples:
  | BrowserName | ProductName        | ProductCatagory        |
  |           1 | mobile accessories | Clothing & Accessories |
  |           5 | Java               | Books                  |
  
@Regression
  Scenario: Amazon product search values are hard coding from feature file using data table map
    When Enter all of the below product name and product category as a data table map
      | ProductName         | ProductCategory        |
      | mobile| Clothing & Accessories |
      | phones             | Electronics            |
    And Click on submit button
    Then Validate the search result
    And Close the Browser
