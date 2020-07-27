
Feature:User should be able to login
  Background:
     Given the user is on the login page


  Scenario:login with valid credentials
    When user logs "username" "password"
    Then the user should be on "Account Summary"


  Scenario: login with invalid credentials
    When user logs "username1" "password"
    Then user should see "Login and/or password are wrong."
