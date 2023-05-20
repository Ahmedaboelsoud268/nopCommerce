@smoke
  Feature:  users could use login functionality to use their accounts
    Scenario: user could login with valid email and password
      Given user go to login page
      When user enter valid email
      And user enter valid password
      And user press on login button
      And user open my account
      Then user login to the system successfully and display my account


    Scenario: user could login with invalid email and password
      Given user go to login page again
      When user enter invalid email
      And user enter valid password again
      And user click on login button
      Then user could not login to the system