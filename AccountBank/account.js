class Account {
   constructor(balance){
     this.balance = balance;
   }
  
   getBalance() {
     return this.balance;
   }
   
   deposit(value) {
     this.balance = this.balance + value;
     return this.balance; 
   }

   debit(value) {
     if(this.balance < value) {
       return "Saldo insuficiente";
     } else {
       this.balance = this.balance - value;
       return this.balance;
     }
   }
}

module.exports = {
  Account
};