@smoke
Feature: wishlist feature
  Scenario: user click on the heart and then success message is displayed with green color
    When user click on the heart emoji
    Then success message is displayed with green color
  Scenario: user click on the tap of wishlist after success message disapear
    When user click on the heart emoji
    And user click on the wishlist until success message invisible
    Then chick the Qty in wishlistis greater than 0


