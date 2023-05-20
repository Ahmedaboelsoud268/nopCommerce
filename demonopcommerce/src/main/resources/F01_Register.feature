@smoke
Feature: F01_Register | users could register with new accounts
  Scenario: guest user could register with valid data successfully
    Given user go to register page
    When user select gender type
    And user enter firstname "automation"
    And user enter lastname "tester"
    And user enter date of birth day
    And user enter date of birth month
    And user enter date of birth year
    When user enter email "test@examble.com" field
    And user fills password fileds "P@ssw0rd"
    And user fills confirm password fileds "P@ssw0rd"
    And user click on register button
    Then success message is displayed with color