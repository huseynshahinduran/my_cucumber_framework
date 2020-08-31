@googlesearch
Feature: Google search

  Background: User is on the google page
    Given user is in the google page

  @iphone
  Scenario: user searches phone in google
    And user searches iphone
    Then verify result has iphone

  @nokia
  Scenario: user searches phone in google
    And user searches nokia
    Then verify result has nokia