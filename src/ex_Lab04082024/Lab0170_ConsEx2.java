package ex_Lab04082024;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab0170_ConsEx2 {
    public static void main(String[] args) {

        //getting input from user and calling constructor

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bank name");
        String userBName= sc.next();
        System.out.println("Enter the bank balance");
        int userBal = sc.nextInt();
        System.out.println("Enter the bankcode");
       String userBCode= sc.next();

       //constructor3 called but instead of hardcoded parameter using scanner userinput was got.
       BankAccount obj6 = new BankAccount(userBName,userBal,userBCode);
       obj6.printdetails();

      //constructor1 called
       BankAccount obj1= new BankAccount();
       obj1.printdetails();

        //constructor2 called
       BankAccount obj2 = new BankAccount("HDFC");
       obj2.printdetails();

        //constructor3 called
        BankAccount obj3 = new BankAccount(25000);
        obj3.printdetails();

        //constructor4 called
       BankAccount obj4 = new BankAccount("Punjab","Pun003");
       obj4.printdetails();

        //constructor5 called
        BankAccount obj5 = new BankAccount("HDFC",35000,"HDFC005");
        obj5.printdetails();

    }
}
