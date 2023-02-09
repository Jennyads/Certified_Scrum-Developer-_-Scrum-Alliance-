const account = require('./account.js');
const assert = require('assert');


function testAccountCreation() {
  // Arrange
  
  // Act
  const newAccount = new account.Account(100);
  const isInstance = newAccount instanceof account.Account
  
  // Assert
  const actual = isInstance;
  const expected = true;
  assert.equal(actual, expected);
}
testAccountCreation();


function testGettingAccountBalance() {
  // Arrange
  const newAccount = new account.Account(100);
  
  // Act
  const balance = newAccount.getBalance();
  
  // Assert
  const actual = balance;
  const expected = 100;
  assert.equal(actual, expected);
}
testGettingAccountBalance();


function testDeposit() {
  // Arrange
  const newAccount = new account.Account(100);
  
  // Act
  const balancePostDeposit = newAccount.deposit(20);
  
  // Assert
  const actual = balancePostDeposit;
  const expected = 120;
  assert.equal(actual, expected);
}
testDeposit();


function testDebitForInsufficientBalance() {
  // Arrange
  const newAccount = new account.Account(100);
  
  // Act
  const response = newAccount.debit(150);
  
  // Assert
  const actual = response;
  const expected = "Saldo insuficiente";
  assert.equal(actual, expected);
}
testDebitForInsufficientBalance();
  

function testDebit() {
  // Arrange
  const newAccount = new account.Account(100);
  
  // Act
  const balancePostDebit = newAccount.debit(20);
  
  // Assert
  const actual = balancePostDebit;
  const expected = 80;
  assert.equal(actual, expected);
}  
testDebit();