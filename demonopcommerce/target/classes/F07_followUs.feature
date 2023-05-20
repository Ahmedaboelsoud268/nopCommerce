@smoke
Feature: F07_followUs | users could open followUs links
  Scenario: user opens facebook link
    When user click on facebook link
    Then the driver navigate to facebook page
  Scenario: user opens twitter link
    When user click on twitter link
    Then the driver navigate to twitter page
    Scenario: user opens rss link
      When user click on rss link
      Then the driver navigate to rss page
  Scenario: user opens youtube link
    When user click on youtube link
    Then the driver navigate to youtube page
