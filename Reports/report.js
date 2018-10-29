$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Demopractise.feature");
formatter.feature({
  "line": 2,
  "name": "Login the facebook application",
  "description": "",
  "id": "login-the-facebook-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Fblogin"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Verify user is able to login the application",
  "description": "",
  "id": "login-the-facebook-application;verify-user-is-able-to-login-the-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User load the facebook application",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enter the user name \u0027Dhanapal\u0027 for fb",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enter the password \u0027XYZ@123\u0027 for fb",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User click the login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User wait for page load",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User verifies the recover your account page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_launch_the_browser()"
});
formatter.result({
  "duration": 20715563364,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_load_the_facebook_application()"
});
formatter.result({
  "duration": 10527199750,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dhanapal",
      "offset": 26
    }
  ],
  "location": "Stepdefinition.user_Enter_the_user_name(String)"
});
formatter.result({
  "duration": 3041418035,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "XYZ@123",
      "offset": 25
    }
  ],
  "location": "Stepdefinition.user_enter_the_password(String)"
});
formatter.result({
  "duration": 215660007,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_click_the_login()"
});
formatter.result({
  "duration": 5138710398,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_wait_for_page_load()"
});
formatter.result({
  "duration": 3575776,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_verifies_the_recover()"
});
formatter.result({
  "duration": 271050094,
  "status": "passed"
});
});