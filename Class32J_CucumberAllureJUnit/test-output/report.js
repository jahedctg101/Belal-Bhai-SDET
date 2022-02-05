$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login_Functionality_Varification.feature");
formatter.feature({
  "name": "Employee Login Functionality Varification",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify Employee Login Funcitionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am in Landing Page",
  "keyword": "Given "
});
formatter.match({
  "location": "step_definitions1.EmpLogin_Functionality_Test.i_am_in_Landing_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Login",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions1.EmpLogin_Functionality_Test.i_click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the EmpLogin Page",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions1.EmpLogin_Functionality_Test.verify_the_EmpLogin_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter valid User Id",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions1.EmpLogin_Functionality_Test.enter_valid_User_Id()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter valid Password",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions1.EmpLogin_Functionality_Test.enter_valid_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions1.EmpLogin_Functionality_Test.click_on_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Employee Homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions1.EmpLogin_Functionality_Test.verify_Employee_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});