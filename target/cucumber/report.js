$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/explicit%20_wait_example.feature");
formatter.feature({
  "name": "Explicit wait",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wait"
    }
  ]
});
formatter.scenario({
  "name": "Explicit wait exmple",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wait"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the demo page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.ExplicitWaitExample.user_is_on_the_demo_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on start button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.ExplicitWaitExample.user_clicks_on_start_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user wait until the page loads",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.ExplicitWaitExample.user_wait_until_the_page_loads()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the Hello World! text is visible",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.ExplicitWaitExample.verify_the_Hello_World_text_is_visible()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});