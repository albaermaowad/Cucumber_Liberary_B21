Feature: login with parameter

  @librarianParam
  Scenario: login as librarian 19
    Given I am on the login page
    When I enter username "librarian19@library"
    And I enter password "6M0J2Wr7"
    And click the sign in button
    Then dashboard should be displayed

@studentParam
    Scenario: login as student 12
      Given I am on the login page
      When I entered username "student12@library"
      And I entered password "UC0LC9Hj"
      And click the sign in button
      Then books should be displayed