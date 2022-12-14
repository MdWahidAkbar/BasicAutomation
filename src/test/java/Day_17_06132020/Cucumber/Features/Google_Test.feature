Feature: Google Test Scenarios


  Scenario Outline: TC01: Allow user to capture google search number on search result

    #following use case covers google test scenario
    Given I Navigate to google home page
    When I Enter a keyword <Cars> on the search field
    When I click the search icon
    When I capture search result and print it
    When I click on More icon
    Then I can select the value <More>



    Examples:
    |Cars|More|
    | Lexus | Videos |
    | BMW   | Books |


#each scenario/scenario outline are individual test cases. No relation between
  #'scenario' is used when there is no loop and 'scenario outline' used when the is loop
    Scenario: TC02: Allow user to go to google sign in page