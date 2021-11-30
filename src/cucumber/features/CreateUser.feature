Feature: Create User

  Scenario: create and register user account
    Given an open browser in hotel
    When user sign in
    And user create account and registered
    Then check if user got registered and close browser