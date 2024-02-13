Feature: Greeting Endpoint

  Scenario Outline: Greeting Scenarios
    Given the application is running
    When I call the endpoint with "<input>" as input
    Then the response should contain a greeting with the provided "<expect>"
    And the response status code should be "<status>"
    Examples:
      | input                           | expect                                 | status |
      |                                 | Hello, World!                          | 200    |
      | Pabla                           | Hello, Pabla!                          | 200    |
      | 123456                          | Hello, 123456!                         | 200    |
      | -123456                         | Hello, -123456!                        | 200    |
      | 9223372036854775807L            | Hello, 9223372036854775807L!           | 200    |
      | -9223372036854775807L           | Hello, -9223372036854775807L!          | 200    |
      | **%%                            | Hello, **%%!                           | 200    |
      | !@#$%^&*()_+=-{}[]\:;"'<>,.?/`~ | Hello, !@#$%^&*()_+=-{}[]\:;"'<>,.?/`~ | 200    |
