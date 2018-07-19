Feature: Victor Login functionality

Scenario Outline: Login function

  Given a browser is at victor homepage
  When a user click on login link
  When a user enter "<Username>" and "<Password>"
  Then a user click on sign in button


 Examples:
|Username                 |Password|
|naveenreddy1213@gmail.com|Testing1|
