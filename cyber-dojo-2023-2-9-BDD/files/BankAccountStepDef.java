import org.junit.*;
import static org.junit.Assert.*;
import io.cucumber.java.en.*;


public class BankAccountStepDef {

    BankAccount myAccount;
    
    @Given("a savings account with balance of {int}")
    public void linha_do_given(int initialBalance) throws Throwable {
        
        myAccount = new BankAccount(initialBalance);
    
        System.out.println("entrando no Given com argumento: " + initialBalance);
    }

    
    @When("a client deposits {int}")
    public void linha_do_when(int amount) throws Throwable {
        
        myAccount.deposit(amount);
        
        System.out.println("entrando no When");
    }
    
    @Then("the saving accounts balance should be {int}")
    public void the_saving_accounts_balance_should_be(int expectedBalance) {
        
        int actualBalance = myAccount.getBalance();
        
        assertEquals(expectedBalance, actualBalance);
        
        
        System.out.println("entrando no Then");
        
    }

}
