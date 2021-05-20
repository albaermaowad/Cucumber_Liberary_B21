Feature: login
  As a user I want to be able to login with username and password

  @librarian
  Scenario: Login as a librarian
    Given I am on the login page
    When I login as a librarian
    Then dashboard should be displayed

  @Student
    Scenario: Login as a student
      Given I am on the login page
      When I login as a student
      Then dashboard should be displayed