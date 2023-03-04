Feature: Min Max Price Box Check of your feature
  I want to use this template for my feature file
  
  Background:
   Given I am in landing page
  

  Scenario: Verify Min Max Box Working
   
    When I click on search box
    Then I enter value inside of search box 
    And click on search button
    Then I am in my Search Page
    And I enter price min
    And I enter price max
    And Click on Go button