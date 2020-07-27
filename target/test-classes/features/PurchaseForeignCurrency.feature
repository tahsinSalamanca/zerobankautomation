Feature:    Purchase Foreign Currency

  Background:
    Given the user is on the login page
    When user logs "username" "password"
    Then navigate to "Pay Bills"

  Scenario:    Available currencies
    When the user accesses the Purchase foreign currency cash tab
    Then following currencies should be available
      |Select One             |
      | Australia (dollar)    |
      | Canada (dollar)       |
      | Switzerland (franc)   |
      | China (yuan)          |
      | Denmark (krone)       |
      | Eurozone (euro)       |
      | Great Britain	(pound) |
      |Hong Kong (dollar)     |
      | Japan (yen)           |
      | Mexico (peso)         |
      | Norway (krone)        |
      | New Zealand (dollar)  |
      |Sweden (krona)         |
      | Singapore (dollar)    |
      |Thailand (baht)        |

  Scenario:	Error message for not selecting currency

    When the user accesses the Purchase foreign currency cash tab
    When user tries to calculate cost without selecting a currency
    Then error message should be "Please, ensure that you have filled all the required fields with valid values." displayed