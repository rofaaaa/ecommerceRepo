@smoke

  Feature: hoverCategories

    Scenario: user select desktop from computers menu
      Given user hover on computers
      When user hover on desktop and click on it

      Then sys open desktop page
