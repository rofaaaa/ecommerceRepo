@smoke

  Feature: add products to wishlist

    Scenario: add HTC One M8 Android L 5.0 Lollipop tp wish list
      Given user navigate to HTC One M8 Android L 5.0 Lollipop
      When user enter wish list btn
      Then product added to wish list successfully

    Scenario: show wishlist list
      Given user navigate to HTC One M8 Android L 5.0 Lollipop
      When user enter wishlist label
      Then show wishlist