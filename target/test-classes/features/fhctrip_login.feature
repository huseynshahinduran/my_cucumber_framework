@fhclogin
Feature: Login feature
  Background: user is on the fhctriplogin page
  Scenario: TC01_user logins with valid credentials
    And user enters valid username
    And user enters valid password
    And user click login button
    Then verify login is successful

    #Homework
  Scenario: TC01_user logins with valid credentials
    And user enters invalid username
    And user enters invalid password
    And user click login button
    Then verify login is not successful