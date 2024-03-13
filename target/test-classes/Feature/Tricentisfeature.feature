Feature: Tetsing Demo Page

  Scenario: User should Open the demo page on ChromeBrowser
    Given User is on the Chrome browser
    When User enters  the URL
    Then User click on the Login
    And User closes the browser
