Feature: As a potential client I want to navigate in https://practice.automationtesting.in

  @Smoke @WathThreeSliders
  Scenario: The client want watch three sliders
    Given The client is in the main page
    When The client do want click on shop menu
    And The client want back so he click on home menu button
    Then The client must watch only three sliders

