Feature: Home page with all dynamic text

  Scenario: Greet logged in user
    Given The logged in user first name is "Jerry" and last name is "Shek" and title is "Mr"
    When I invoke greet logged in user
    Then I should get user name as "Mr Jerry Shek"

  Scenario: Greet logged in user in separate steps
    Given The logged in user first name is "Jerry"
    And last name is "Shek"
    And title is "Mr"
    When I invoke greet logged in user
    Then I should get user name as "Mr Jerry Shek"

  Scenario: Greet logged in user without last name
    Given The logged in user first name is "Jerry"
    * title is "Mr"
    When I invoke greet logged in user
    Then I should get user name as "Mr Jerry"

  Scenario: Greet logged in user with data table
    Given The logged in user is
    | firstName | lastName | title |
    | Jerry | Shek | Mr |
    When I invoke greet logged in user
    Then I should get user name as "Mr Jerry Shek"
