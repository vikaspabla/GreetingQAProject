Feature: Greeting Scenarios

  Background:
    Given the application is running

  Scenario: Basic Greeting
    When I access the /greeting endpoint
    Then the response should contain a greeting with the default name "World"

  Scenario: Customized Greeting
    When I access the /greeting endpoint with a custom name
    Then the response should contain a greeting with the provided name

  Scenario: Greeting Counter
    When I access the /greeting endpoint multiple times
    Then each response should have a unique greeting ID
