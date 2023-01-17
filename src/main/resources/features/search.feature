@smoke

  Feature: Logged User could search for any product

    Scenario: user could search using product name
      Given user click on search field
      When user enter product name in search
      And user click on search btn
      Then sys response with product list

    Scenario: user could search for product using sku
      Given user click on search field
      When user enter product using sk
      And user click on search btn
      Then sys response with product page