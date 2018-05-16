$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MyApplication.feature");
formatter.feature({
  "line": 3,
  "name": "Parcel",
  "description": "",
  "id": "parcel",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Login",
  "description": "",
  "id": "parcel;login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Open Chrome start application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Enter valid username and password",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user should able to login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "SmokeTest.Open_Chrome_start_application()"
});
formatter.result({
  "duration": 13927287162,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.Enter_valid_username_and_password()"
});
formatter.result({
  "duration": 3327008525,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.user_should_able_to_login_successfully()"
});
formatter.result({
  "duration": 1552061639,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Parametarization",
  "description": "",
  "id": "parcel;parametarization",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "Enter valid \"mpatel1\" and \"Myprodpass@72\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user should able to login in parametarization",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "mpatel1",
      "offset": 13
    },
    {
      "val": "Myprodpass@72",
      "offset": 27
    }
  ],
  "location": "SmokeTest.Enter_valid_username_and_password(String,String)"
});
formatter.result({
  "duration": 3246283319,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.user_should_able_to_login_in_parametarization()"
});
formatter.result({
  "duration": 1547146228,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 17,
  "name": "DataDriven Parametarization",
  "description": "",
  "id": "parcel;datadriven-parametarization",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@tag3"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "DataDriven \"\u003cUsername\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "parcel;datadriven-parametarization;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 21,
      "id": "parcel;datadriven-parametarization;;1"
    },
    {
      "cells": [
        "Uname1",
        "Pass1"
      ],
      "line": 22,
      "id": "parcel;datadriven-parametarization;;2"
    },
    {
      "cells": [
        "Uname2",
        "Pass2"
      ],
      "line": 23,
      "id": "parcel;datadriven-parametarization;;3"
    },
    {
      "cells": [
        "Uname3",
        "Pass3"
      ],
      "line": 24,
      "id": "parcel;datadriven-parametarization;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 22,
  "name": "DataDriven Parametarization",
  "description": "",
  "id": "parcel;datadriven-parametarization;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    },
    {
      "line": 16,
      "name": "@tag3"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "DataDriven \"Uname1\" and \"Pass1\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "Uname1",
      "offset": 12
    },
    {
      "val": "Pass1",
      "offset": 25
    }
  ],
  "location": "SmokeTest.DataDriven_username_and_password(String,String)"
});
formatter.result({
  "duration": 3318408005,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "DataDriven Parametarization",
  "description": "",
  "id": "parcel;datadriven-parametarization;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    },
    {
      "line": 16,
      "name": "@tag3"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "DataDriven \"Uname2\" and \"Pass2\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "Uname2",
      "offset": 12
    },
    {
      "val": "Pass2",
      "offset": 25
    }
  ],
  "location": "SmokeTest.DataDriven_username_and_password(String,String)"
});
formatter.result({
  "duration": 3249843033,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "DataDriven Parametarization",
  "description": "",
  "id": "parcel;datadriven-parametarization;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    },
    {
      "line": 16,
      "name": "@tag3"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "DataDriven \"Uname3\" and \"Pass3\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "Uname3",
      "offset": 12
    },
    {
      "val": "Pass3",
      "offset": 25
    }
  ],
  "location": "SmokeTest.DataDriven_username_and_password(String,String)"
});
formatter.result({
  "duration": 3260198642,
  "status": "passed"
});
});