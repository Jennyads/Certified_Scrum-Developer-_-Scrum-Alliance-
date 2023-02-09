
public class BankAccount {

    private int balance;
    
    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }
    
    public void deposit(int amountToDeposit) {
        balance += amountToDeposit;
    }

    public int getBalance() {
        return balance;
    }
    
    
}
