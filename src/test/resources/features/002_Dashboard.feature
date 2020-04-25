Feature: Verify Dashboard Page Module

  Scenario: Verify Dashboard Page loads by default on Successful Login
    Given User launches application
    When User enters default username and default password
    And User clicks Login Button
    Then User should login into application
    And User is on Dashboard page
    And User closes application