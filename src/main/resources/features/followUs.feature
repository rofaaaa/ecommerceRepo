@smoke

  Feature: follow us

    Scenario: : user opens facebook link
      Given user navigate to facebook page
      Then user open facebook link in new tab

    Scenario:  user opens twitter link
      Given user navigate to twitter page
      Then user open twitter link in new tab

    Scenario: user opens rss link
      Given user navigate to rss page
      Then user open rss link in new tab


    Scenario: user opens youtube link
      Given user navigate to youtube page
      Then user open youtube link in new tab