@wip
Feature: Navigating to specific	accounts in	Accounts Activity

  Background:
    Given the user is on the login page
    When user logs "username" "password"

  Scenario: Savings	account	redirect
    When   the user clicks on "Savings" link on the Account Summary page
    Then   page should have the title "Zero - Account Activity"
    And    the	Account	drop	down	default	option	should	be	"Savings"


  Scenario:Brokerage account redirect
    When   the user clicks on "Brokerage" link on the Account Summary page
    Then   page should have the title "Zero - Account Activity"
    And    the	Account	drop	down	default	option	should	be	"Brokerage"

  Scenario:	Checking account redirect
    When	the user clicks on "Checking" link on the Account Summary page
    Then	page should have the title "Zero - Account Activity"
    And	    the	Account	drop	down	default	option	should	be	"Checking"

  Scenario:	Credit Card	account	redirect
    When	the user clicks on "Credit card" link on the Account Summary page
    Then	page should have the title "Zero - Account Activity"
    And	    the	Account	drop	down	default	option	should	be	"Credit card"

  Scenario:	Loan account redirect
    When	the user clicks on "Loan" link on the Account Summary page
    Then	page should have the title "Zero - Account Activity"
    And	    the	Account	drop	down	default	option	should	be	"Loan"