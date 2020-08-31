@fhcregister
Feature: FHC Trip Registration
  Scenario:FHC Trip Registration Test
    Given kullanici fhctrip sayfasindadir
    And kullanici "create a new account" butonuna tiklar
    And kullanici username girer
    And kullanici password girer
    And kullanici email girer
    And kullanici Fulname girer
    And kullanici phone girer
    And kullanici SSN girer
    And kullanici driving lisans girer
    And kullanici Country dropdown dan secer
    And kullanici  state dropdown dan secer
    And kullanici address girer
    And kullanici working sector girer
    And kullanici birthday girer
    Then kullanici save butonuna tiklar