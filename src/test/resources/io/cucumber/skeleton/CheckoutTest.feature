@RegressionTest
Feature: Checkout product

  Scenario: Login An Account
    Given Navigate to Hepsiburada
    And Click on the my account
    And Click on the login
    And Typing a user email address
    And Typing a user password address
    When Click on the login button
    Then Redirect home page

  Scenario: Search the product and add to basket
    Given Typing a product name in the search bar
    And Select product
    And Add product
    And Close the success modal
    When Re-add from different merchant
    And  Close the text modal
    Then View account basket



