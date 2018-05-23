$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MyApplication.feature");
formatter.feature({
  "line": 2,
  "name": "Parcel",
  "description": "",
  "id": "parcel",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Login",
  "description": "",
  "id": "parcel;login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Open Chrome start application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter valid username and password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user should able to login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "SmokeTest.Open_Chrome_start_application()"
});
formatter.result({
  "duration": 18244815603,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.Enter_valid_username_and_password()"
});
