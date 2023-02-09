
public class BankAccount {

    public int balance;

    public BankAccount(int balance){
        this.balance = balance;
    }
    
    public int getBalance(){
        return balance;
    }
    
    public void depositValue(int valueToDeposit){
        balance = balance + valueToDeposit;
    }
    
    public void withdraw(int amount) {
        if (balance >= amount){
            balance -= amount;
        }
    }
   
}
