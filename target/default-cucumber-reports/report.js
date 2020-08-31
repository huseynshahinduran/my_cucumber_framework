$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/automation_practice_TC1.feature");
formatter.feature({
  "name": "Automation Practise 1",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@testcase1"
    }
  ]
});
formatter.scenario({
  "name": "Automation practice create account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@testcase1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user web sayfasinda",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.AutomationPracticeStepDef.user_web_sayfasinda()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sign in linkine tiklar",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.AutomationPracticeStepDef.user_sign_in_linkine_tiklar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Create an account bolumune  email adresi girer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.AutomationPracticeStepDef.user_Create_an_account_bolumune_email_adresi_girer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Create an Account butonuna basar",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.AutomationPracticeStepDef.create_an_Account_butonuna_basar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user kisisel bilgilerini ve iletisim bilgilerini girer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.AutomationPracticeStepDef.user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Register butonuna basar",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.AutomationPracticeStepDef.user_Register_butonuna_basar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "hesap olusturuldugunu dogrulayin",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.AutomationPracticeStepDef.hesap_olusturuldugunu_dogrulayin()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});