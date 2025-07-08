Feature: User Login
  As a registered user
  I want to login to my account
  So that I can see my personalized Dashboard

@api
  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters valid credentials
    Then the user should be directed to the dashboard
