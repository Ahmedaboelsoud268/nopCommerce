@smoke
Feature: F06_Homeslider
  Scenario: first slider is clickable on home page
    When user click on the first slider
    Then the webpage reload to the home page
  Scenario: second slider is clickable on home page
    When user click on the second slider
    Then the webpage reload to the same home page