Feature: Login Functionalities

  Scenario: Valid admin login
    Given   open the browser and launch HRMS application
    When    user enters valid email and valid password
    And     click on login button
    Then    user is logged successfully