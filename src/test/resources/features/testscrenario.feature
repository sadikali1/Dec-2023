@tag1
Feature: calculation

	Background:
		Given I am backgroud
	
	@Smoke @Regression @UAT @UserStory1 @TC11
  Scenario: add two integer values
    Given I have two integer number 10 and 20
    When I add both numbers
    Then I verify result is 30

	@Regression @UAT @UserStory2 @TC12
  Scenario Outline: add two integer values
    Given I have two integer number <firstNumber> and <secondNumber>
    When I add both numbers
    Then I verify result is <result>

    Examples: 
      | firstNumber | secondNumber | result |
      |          10 |           20 |     30 |
      |          30 |           40 |     70 |
      |          10 |           68 |     10 |
      |          10 |           30 |     40 |
