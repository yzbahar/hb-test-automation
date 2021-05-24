@RegressionTest
Feature: Adding product

  Scenario: Adding a product to basket
    Given Navigate to Website
    And Click on Book, Music, Movie, Hobby category
    And Click on the Remote Control Tools tab under the category
    And Choose one of the drone spare parts
    When Add product to basket
    And Close the modal
    Then View basket

