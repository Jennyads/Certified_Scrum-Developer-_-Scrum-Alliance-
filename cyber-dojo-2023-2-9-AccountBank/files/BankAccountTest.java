// A simple example to get you started
// JUnit assertion - the default Java assertion library
// https://junit.org/junit5/

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class BankAccountTest {

    @Test
    void get_balance_test() {
        BankAccount myAccount = new BankAccount(100);
        int expected = 100;
        int actual = myAccount.getBalance();
        assertEquals(expected, actual);
    }
    
    @Test
    void should_add_value_to_balance() {
        System.out.println("Deu certo");
        BankAccount myAccount = new BankAccount(100);
        int depositAmount = 50;
        
        myAccount.depositValue(depositAmount);
        
        int currentBalance = myAccount.getBalance();
        int expectedBalance = 150;
        assertEquals(expectedBalance, currentBalance);
    }
    
    @Test
    void should_keep_seperates_balances() {
        BankAccount myAccount1 = new BankAccount(100);
        BankAccount myAccount2 = new BankAccount(50);
        
        myAccount1.depositValue(200);
        
        assertEquals(300, myAccount1.getBalance());
        assertEquals(50, myAccount2.getBalance());
    }
    
    @Test 
    void should_decrease_balance_when_suficient_balance(){
        BankAccount myAccount = new BankAccount(100);
        
        myAccount.withdraw(30);
        
        assertEquals(70, myAccount.getBalance());
    }
    
    @Test
    void should_not_decrease_balance_when_insuficient_balance(){
        BankAccount myAccount = new BankAccount(20);
        
        try {
        myAccount.withdraw(100);
        } 
        catch (Exception e) {
            final String expected = "Not enough balance for deposit!";
            assertEquals( expected, e.getMessage());
        } 
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
