Feature: Verify Dashboard Page Module

  Background:
    Given User launches application

  Scenario: Verify Dashboard Page loads by default on Successful Login
    Given User enters default username and default password
    When User clicks Login Button
    Then User should login into application
    And User is on Dashboard page
    And User closes application