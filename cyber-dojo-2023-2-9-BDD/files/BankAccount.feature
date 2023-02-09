
Feature: Bank account

Rule: Savings accounts can never be negative


  Scenario: Clients can deposit money into their saving account
  
    Given a savings account with balance of 100
    When a client deposits 50
    Then the saving accounts balance should be 150
    
