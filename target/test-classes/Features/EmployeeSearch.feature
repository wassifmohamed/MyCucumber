Feature: Searching the employee





  @empSearch
   Scenario: Search employee by Id
     Given   open the browser and launch HRMS application
     When    user enters valid email and valid password
     And     click on login button
     When    user click on PIM option
     And     when user enter  valid employee id
     When    Click on search button
     And     user see employee information is displayed



 Scenario: Search employee by job title
   Given   open the browser and launch HRMS application
   When    user enters valid email and valid password
   And     click on login button
   When    user click on PIM option
   When    user select Jop title
   When    Click on search button
   And     user see employee information is displayed

