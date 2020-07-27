Feature:Account	summary	page

  Background:
    Given the user is on the login page
    When user logs "username" "password"


  Scenario: Summary account types
    When page should have the title "Zero - Account Summary"
    And the page should have to following account types
      | Cash Accounts | Investment Accounts | Credit Accounts | Loan Accounts |
    Then Credit	Accounts table must	have following
      | Account | Credit Card | Balance |


  Scenario: Activity page
    When navigate to "Account Activity"
    And page should have the title "Zero - Account Activity"
    And the	Account	drop	down	default	option	should	be	"Savings"
    Then drop down should have	the following options
      | Savings | Checking | Savings | Loan | Credit Card | Brokerage |
    Then Transactions	table	should	have following
      | Date | Description | Deposit | Withdrawal |
  @try
  Scenario Outline: Pay Bills page
    When navigate to "Pay Bills"
    And page should have the title "Zero - Pay Bills"
    And user completes Pay operation with "<amount>" "<date>" "<description>"
    Then "The payment was successfully submitted." should be displayed
    Then "Please fill out this field message!" wrong should be displayed

    Examples:
      | amount | date       | description |
      | 100    | 2020-01-30 | hola        |
      | 105    | 2020-01-20 | hola2       |
      | 200    | 2020-01-26 | hola3       |



