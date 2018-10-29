$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Demopractise.feature");
formatter.feature({
  "line": 2,
  "name": "It contains more scenarios",
  "description": "",
  "id": "it-contains-more-scenarios",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@features"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "verify the recover my account",
  "description": "",
  "id": "it-contains-more-scenarios;verify-the-recover-my-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@data"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User launch browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enter the url",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User click login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User close the browser",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clear cokie",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_launch_browser()"
});
formatter.result({
  "duration": 333738239,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_the_url()"
});
formatter.result({
  "duration": 332080,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_login_button()"
});
formatter.result({
  "duration": 133140,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_close_the_browser()"
});
formatter.result({
  "duration": 69398,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 27,
  "name": "Verfiy the user login without example keyword",
  "description": "",
  "id": "it-contains-more-scenarios;verfiy-the-user-login-without-example-keyword",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@data"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "User launch browser",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "User enter user name \"Vignesh\"",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "User enter password \"abc\"",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "User close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_launch_browser()"
});
formatter.result({
  "duration": 71968,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Vignesh",
      "offset": 22
    }
  ],
  "location": "StepDefinition.user_enter_user_name(String)"
});
formatter.result({
  "duration": 2717301,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc",
      "offset": 21
    }
  ],
  "location": "StepDefinition.user_enter_password(String)"
});
formatter.result({
  "duration": 611727,
  "error_message": "java.lang.Exception: HTML Report exception\r\n\tat org.cucumber.stepdefinition.StepDefinition.user_enter_password(StepDefinition.java:55)\r\n\tat ✽.Then User enter password \"abc\"(Demopractise.feature:30)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.user_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 34,
  "name": "Verify the userlogin with data tables",
  "description": "",
  "id": "it-contains-more-scenarios;verify-the-userlogin-with-data-tables",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 33,
      "name": "@data_list"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "User launch browser",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "user enter credentials",
  "rows": [
    {
      "cells": [
        "vignesh",
        "xyz"
      ],
      "line": 37
    },
    {
      "cells": [
        "Dhanapal",
        "abc"
      ],
      "line": 38
    },
    {
      "cells": [
        "Venishubha",
        "abc"
      ],
      "line": 39
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "User close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launch_browser()"
});
formatter.result({
  "duration": 74024,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_credentials(DataTable)"
});
formatter.result({
  "duration": 2232547,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_close_the_browser()"
});
formatter.result({
  "duration": 256000,
  "status": "passed"
});
formatter.scenario({
  "line": 43,
  "name": "Verify the userlogin with data tables using map",
  "description": "",
  "id": "it-contains-more-scenarios;verify-the-userlogin-with-data-tables-using-map",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 42,
      "name": "@data_map"
    }
  ]
});
formatter.step({
  "line": 44,
  "name": "User launch browser",
  "keyword": "Given "
});
formatter.step({
  "line": 45,
  "name": "user enter credentials using map",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ],
      "line": 46
    },
    {
      "cells": [
        "vignesh",
        "xyz"
      ],
      "line": 47
    },
    {
      "cells": [
        "Dhanapal",
        "abc"
      ],
      "line": 48
    },
    {
      "cells": [
        "Venishubha",
        "abc"
      ],
      "line": 49
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 50,
  "name": "User close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launch_browser()"
});
formatter.result({
  "duration": 76080,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_credentials_using_map(DataTable)"
});
formatter.result({
  "duration": 1322152,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_close_the_browser()"
});
formatter.result({
  "duration": 66313,
  "status": "passed"
});
});