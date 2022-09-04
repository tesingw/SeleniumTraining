Feature: Login functionality test

  Scenario: FB login functionality
    Given login into fb application
    When user enters username and password
    Then user needs to login successfully

  Scenario Outline: FB login functionality
    Given login into fb application
    When user enters <username> and <password>
    Then user needs to login <successfully>

    Examples:
      | username | password  | successfully |
      | test     | pass134   | Success      |
      | test1    | pass1343  | Failed       |
      | test2    | pass13456 | Ignore       |


