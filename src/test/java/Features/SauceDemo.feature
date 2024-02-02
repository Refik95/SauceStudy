@SauceStudy
  Feature: SauceDemo Check Test Cases

    @AllEmpty
    Scenario Outline: Empty Username & Empty Password
      Given User is at login page
      When Click login button
      Then Check "<error>" message about username
      Examples:
      |error|
      |Username is required     |

    @EmptyPassword
    Scenario Outline: Empty Password
      Given User is at login page
      When Type "<username>" for Username field
      When Click login button
      Then Check "<error>" message about password
      Examples:
        |username|error               |
        |abcd    |Password is required|

      @EmptyUsername
      Scenario Outline: Empty Username
        Given User is at login page
        When Type "<password>" for Password field
        When Click login button
        Then Check "<error>" message about username
        Examples:
        |password|error                   |
        |123456  |Username is required    |

        @FalseLogin
        Scenario Outline: Correct Username & False Password
          Given User is at login page
          When Type Correct "<username>" for Username field
          When Type False "<password>" for Password field
          When Click login button
          Then Check "<error>" message about don't match
          Examples:
          |username     |error                                                      |password|
          |standard_user|Username and password do not match any user in this service|abc1234 |

        @FalseLogin2
        Scenario Outline: False Username & Correct Password
          Given User is at login page
          When Type False "<username>" for Username field
          When Type Correct "<password>" for Password field
          When Click login button
          Then Check "<error>" message about don't match
          Examples:
            |username|error                                                      |password     |
            |abds    |Username and password do not match any user in this service|secret_sauce |

    @CorrectLogin
    Scenario Outline: False Username & Correct Password
      Given User is at login page
      When Type Correct "<username>" for Username field
      When Type Correct "<password>" for Password field
      When Click login button
      Then Check Succesfull Login
      Examples:
        |username     |password     |
        |standard_user|secret_sauce |

