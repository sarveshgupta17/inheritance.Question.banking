package bankingClasses;
import bankingInterface.bankfunct;

public class baseClass implements bankfunct{
    private int accountNo;
    private String name;
    private int accBalance;
    private String email;

    public baseClass() {
        accountNo=0;
        name=null;
        accBalance=0;
        email=null;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(int accBalance) {
        this.accBalance = accBalance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void createAccount(String name, String email) {
        this.name=name;
        this.email=email;
    }

    @Override
    public void widhdrawal(int ammount) {
        accBalance = accBalance - ammount;
        System.out.println("you have withdrawl"+ ammount + "rs ");
        System.out.println("your current balance is = " + accBalance);

    }

    @Override
    public void deposit(int ammount) {
        accBalance=accBalance+ammount;
        System.out.println("you just have deposited"+ ammount +"rs in your account");
        System.out.println("now your current bank balance is ="+ accBalance);

    }

    @Override
    public void deleteAccount(int accountNo) {
        System.out.println("your account has been deleted with account no ="+ accountNo);


    }
}
