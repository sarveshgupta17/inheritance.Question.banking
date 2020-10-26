package mainClassPackage;
import bankingClasses.baseClass;
import java.util.Scanner;

public class myMain {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        baseClass ob =new baseClass();
        ob.createAccount("vaibhav","vaibhav2gmail.com");
        int l;
        System.out.println("enter your account no.");
        l=sc.nextInt();
        ob.setAccountNo(l);
        int n;
        System.out.println("enter your account balance");
        n= sc.nextInt();
        ob.setAccBalance(n);
        System.out.println("**** here is the menu  ****  ");
        System.out.println("press 1 to withdraw");
        System.out.println("press 2 to deposit");
        System.out.println("press 3 to delete the account");
        System.out.println("press 0 to exit");
        int temp;
        System.out.println("enter your decision");
        temp=sc.nextInt();
        while(temp !=0) {

            //widthdrawing amount
            if (temp == 1) {
                int wAmmount;
                System.out.println("enter the withdrawel ammount");
                wAmmount = sc.nextInt();


                ob.widhdrawal(wAmmount);
                System.out.println();

                System.out.println("press yoyr new decision (1 , 2 ,3 )  or press 0 to exit");
                temp=sc.nextInt();
            }
            //depositing
            if (temp == 2) {

                int dAmmount;
                System.out.println("enter the amount to be deposit");
                dAmmount = sc.nextInt();

                ob.deposit(dAmmount);
                System.out.println();
                System.out.println("press yoyr new decision (1 , 2 ,3 )  or press 0 to exit");
                temp=sc.nextInt();
            }
            //deleatAccount
            if (temp == 3) {
                ob.deleteAccount(ob.getAccountNo());
                System.out.println("press yoyr new decision (1 , 2 ,3 )  or press 0 to exit");
                temp=sc.nextInt();
            }
        }

    }
}
