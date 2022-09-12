#Autor:Jorge Neira
@stories

Feature: As user i want to register in web site utest

  @scenario1
  Scenario: Create an account in utest

    Given User wants to create an account
    When User fills the form with the data
      | firstName | lastName | email                   | monthBirth   | dayBirth  | yearBirth | city  | zip    | country  | computer | osVersion | osLanguage | password   |
      | Jorge     | Neira    | jorgeneira@example.com  | March        | 15        | 1989      | Bogotá | 110111 | Colombia | Windows  | 10        | Spanish    | Bogota2022 |
    Then User create an account and Complete Setup