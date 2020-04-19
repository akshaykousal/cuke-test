Feature: Verify Login Page Module

  Scenario: Verify login with default user and password
    Given User launches application
    When User enters default username and default password
    And User clicks Login Button
    Then User should login into application
    And User closes application