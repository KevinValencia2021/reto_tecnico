Feature: Register in OrangeHRM
  Scenario Outline: Create new Employee
    Given Login into page with credentials for Login "<username>" and "<password>"
    When Select section PIM
    And Create employee
    Then Validate new employee
    Examples:
      | username | password | section |
      | Admin    | admin123 | PIM     |