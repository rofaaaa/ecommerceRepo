@smoke

  Feature: user should be able to log in

    Scenario: user should login with valid mail and pass
      Given user navigate to login page
      When user enter valid name and pass
      And click login btn
      Then user should login successfully

    Scenario: user should login with not valid mail and pass
      Given user navigate to login page
      When user enter invalid name and pass
      And click login btn
      Then user cant login