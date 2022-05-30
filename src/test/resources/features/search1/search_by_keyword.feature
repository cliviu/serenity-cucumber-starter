Feature: Search by keyword yy

  Scenario: Searching for a cucumber
    Given Sergey is researching things on the internet
    When he looks up "Cucumber"
    Then he should see information about "Cucumber"

  Scenario: Searching for an onion
    Given Thomas is researching things on the internet
    When he looks up "Onion"
    Then he should see information about "Onion"

