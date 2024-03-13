Feature: Product search on demowebshop

  Scenario: User should search for a product in the searchpage
    Given User is on Chrome Browser
    When Users enters the url
    Then User is on Login Page
    Then User Searches on search page and close Browser
