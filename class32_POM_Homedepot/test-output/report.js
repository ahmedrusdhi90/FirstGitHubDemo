$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/MinPrice_MaxPrice_Box_Check.feature");
formatter.feature({
  "name": "Min Max Price Box Check of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I am in landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "step_definitions.TestDef_MinMax_Box_Check.i_am_in_landing_page()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat pages.LandingPage.navigateURL(LandingPage.java:10)\r\n\tat step_definitions.TestDef_MinMax_Box_Check.i_am_in_landing_page(TestDef_MinMax_Box_Check.java:18)\r\n\tat ✽.I am in landing page(file:///C:/Java/WorkSpace/class32_POM_Homedepot/src/test/resources/features/MinPrice_MaxPrice_Box_Check.feature:5)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Verify Min Max Box Working",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I click on search box",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions.TestDef_MinMax_Box_Check.i_click_on_search_box()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter value inside of search box",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.TestDef_MinMax_Box_Check.i_enter_value_inside_of_search_box()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.TestDef_MinMax_Box_Check.click_on_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I am in my Search Page",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.TestDef_MinMax_Box_Check.i_am_in_my_Search_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter price min",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.TestDef_MinMax_Box_Check.i_enter_price_min()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter price max",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.TestDef_MinMax_Box_Check.i_enter_price_max()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Go button",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.TestDef_MinMax_Box_Check.click_on_Go_button()"
});
formatter.result({
  "status": "skipped"
});
});