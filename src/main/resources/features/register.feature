@smoke

  Feature: register | guest should register with new account

    Scenario: user should register with valid data
      Given user go to register page
      When user select gender
      And user enter first name
      And user enter last name
      And user enter date of birth
      And user enter valid email
      And user enter company name
      And user enter password
      And user confirm password
      Then user click on register btn


