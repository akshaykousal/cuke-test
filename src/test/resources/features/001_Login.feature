Feature: Verify Login Page Module

  Background:
    Given User launches application

  Scenario: Verify login with default user and password
    Given User enters default username and default password
    When User clicks Login Button
    Then User should login into application
    And User closes application