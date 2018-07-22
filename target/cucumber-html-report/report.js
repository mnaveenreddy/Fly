$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Victor Login functionality",
  "description": "",
  "id": "victor-login-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Login function",
  "description": "",
  "id": "victor-login-functionality;login-function",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "a browser is at victor homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "a user click on login link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "a user enter \"\u003cUsername\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "a user click on sign in button",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "victor-login-functionality;login-function;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 12,
      "id": "victor-login-functionality;login-function;;1"
    },
    {
      "cells": [
        "naveenreddy1213@gmail.com",
        "Testing1"
      ],
      "line": 13,
      "id": "victor-login-functionality;login-function;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Login function",
  "description": "",
  "id": "victor-login-functionality;login-function;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "a browser is at victor homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "a user click on login link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "a user enter \"naveenreddy1213@gmail.com\" and \"Testing1\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "a user click on sign in button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinistions.a_browser_is_at_victor_homepage()"
});
formatter.result({
  "duration": 14711759189,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinistions.a_user_click_on_login_link()"
});
formatter.result({
  "duration": 448876187,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "naveenreddy1213@gmail.com",
      "offset": 14
    },
    {
      "val": "Testing1",
      "offset": 46
    }
  ],
  "location": "LoginStepDefinistions.a_user_enter_and(String,String)"
});
formatter.result({
  "duration": 1726610368,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinistions.a_user_navigates_to_his_personal_homepage()"
});
formatter.result({
  "duration": 151389472,
  "status": "passed"
});
});