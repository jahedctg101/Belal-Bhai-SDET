Feature: Employee Login Functionality Varification

  Scenario: Verify Employee Login Funcitionality
    Given I am in Landing Page
    When I click on Login
    Then Verify the EmpLogin Page
    And Enter valid User Id
    And Enter valid Password
    And Click on Login Button
    Then Verify Employee Homepage
