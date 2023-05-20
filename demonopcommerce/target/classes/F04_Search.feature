@smoke
Feature: User can use search feature
  Scenario Outline : user could search using product name
    Given user in home page
    When user enter "<product>" for search
    And user click on search button
    Then search results for "<product>" are displayed

    Examples:
      |product|
      | book  |
      | laptop|
      | nike  |

  Scenario Outline : user could search using sku
    When user enter "<sku>" for search2
    And user click on search button2
    Then search results for "<sku>" are displayed using sku

    Examples:
      |sku|
      | SCI_FAITH  |
      | APPLE_CAM|
      | SF_PRO_11  |
