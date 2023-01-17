@smoke

  Feature: Currencies Feature in

    Scenario: verify Euro Symbol (€) in products
      Given user select Euro Symbol
      When verify Euro Symbol
      Then user should login successfully
