package aula156;

import aula156.entities.Account;
import aula156.entities.BusinessAccount;
import aula156.entities.SavingsAccount;

public class Aula156 {
    public static void main(String[] args) {
        Account acc0 = new Account(1001, "Alex", 1000.0);
        //BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        
        Account acc4 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);


        // UPCASTING

        // Account acc1 = bacc;
        // Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);



        // DOWNCASTING

     // BusinessAccount acc4 = acc2;
//        BusinessAccount acc4 = (BusinessAccount) acc2;
//        acc4.loan(100.0);
//
//      //  BusinessAccount acc5 = (BusinessAccount) acc3;
//        if(acc3 instanceof BusinessAccount ){
//            BusinessAccount acc5 = (BusinessAccount) acc3;
//            acc5.loan(200.0);
//            System.out.println("Loan!");
//        }
//
//        if(acc3 instanceof SavingsAccount){
//            SavingsAccount acc5 = (SavingsAccount) acc3;
//            acc5.updateBalance();
//            System.out.println("Update!");
//        }


        acc0.withdraw(200.0);
        System.out.println("Balanço acc0: " + acc0.getBalance());

        acc2.withdraw(200.0);
        System.out.println("Balanço acc2: " + acc2.getBalance());

        acc4.withdraw(200.0);
        System.out.println("Balanço acc3: " + acc4.getBalance());

    }
}
