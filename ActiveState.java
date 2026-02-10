public class ActiveState implements AccountState {
    @Override
    public void activate(Account account) {
        System.out.println("Account is already activated!");
    }
    
    @Override
    public void suspend(Account account) {
        account.setAccountState(new SuspendedState());
        System.out.println("Account is suspended!");
    }
    
    @Override
    public void close(Account account) {
        account.setAccountState(new ClosedState());
        System.out.println("Account is closed!");
    }
    
    @Override
    public void deposit(Account account, double amount) {
        account.setBalance(account.getBalance() + amount);
        System.out.println("Account Number: " + account.getAccountNumber() + 
                         " | Balance: " + account.getBalance());
    }
    
    @Override
    public void withdraw(Account account, double amount) {
        account.setBalance(account.getBalance() - amount);
        System.out.println("Account Number: " + account.getAccountNumber() + 
                         " | Balance: " + account.getBalance());
    }
    
    @Override
    public String toString(Account account) {
        return "Account Number: " + account.getAccountNumber() + 
               " | Balance: " + account.getBalance();
    }
}
