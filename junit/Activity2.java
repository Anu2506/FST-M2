package Activities;

import org.junit.Test;

public class Activity2 {
    private Integer balance;
    
    // Create a constructor
    public Activity2(Integer initialBalance) {
        balance = initialBalance;
    }

    // Add method to calculate
    // balance amount after withdrawal
    public Integer withdraw(Integer amount) {
        if (balance < amount) {
            throw new NotEnoughFundsException(amount, balance);
        }
        balance -= amount;
        return balance;
    }
    public class NotEnoughFundsException extends RuntimeException {

        public NotEnoughFundsException(Integer amount, Integer balance) {
            super("Attempted to withdraw " + amount + " with a balance of " + balance);
        }
        @Test
        void notEnoughFunds() {
            // Create an object for BankAccount class
        	Activity2 account = new Activity2(9);

            // Assertion for exception
            assertThrows(NotEnoughFundsException.class, () -> account.withdraw(10));
        }
    }
}
