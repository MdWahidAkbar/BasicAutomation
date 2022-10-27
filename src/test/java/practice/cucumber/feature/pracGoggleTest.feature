Feature: practice Google Test

  Scenario Outline: TC01: Allow google to search and type cars

    #following can be used for google test
    Given I Navigate to google home page
    When I can write <cars> in the google search box
    When I can click on the search button
    When I can capture text and print result
    When I can click on more Item
    Then I can select the books


    Examples:
    |cars|
    |lexus|
    |BMW|


    #each scenario/scenario outline are individual test cases. No relation between
  Scenario: TC02: Allow user to go to google sign in page