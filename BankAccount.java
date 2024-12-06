public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) 
    {
        this.balance = initialBalance;
    }

    public void deposit(double amount) 
    {
        if (amount <= 0) 
        {
          System.out.println("Enter a valid amount to deposit.");
        };
        balance += amount;
        System.out.println("Deposited: " + amount + ". New Balance: " + balance);
    }
    public void withdraw(double amount) 
    {
        if (amount <= 0) 
        {
          System.out.println("Enter a valid amount to withdraw.");
        }
        if (amount > balance)
        {
          System.out.println("Insufficient balance.");
        } 
        balance -= amount;
        System.out.println("Withdrew: " + amount + ". New Balance: " + balance);
    }
    public void checkBalance() 
    {
        System.out.println("Your Balance: " + balance);
    }
}

