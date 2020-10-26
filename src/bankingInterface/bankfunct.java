package bankingInterface;

public interface bankfunct {
    public abstract void createAccount(String name,String email);
    public abstract void widhdrawal(int ammount);
    public abstract void deposit(int ammount);
    public abstract void deleteAccount(int accountNo);
}
