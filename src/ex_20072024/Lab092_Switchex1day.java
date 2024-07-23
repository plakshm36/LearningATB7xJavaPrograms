package ex_20072024;

import java.util.Scanner;

public class Lab092_Switchex1day {
    // If Else - Condition  ( If, else If , else) - multiple condition

    // Switch - Better way to 2+ condition
    // Which day it is - Day to from 1 to 7
    // 3 -> Wed
    public static void main(String[] args) {
        Scanner sc1 =  new Scanner(System.in);
        System.out.println("Enter the day from 1 to 7,it will tell which day it is in the week:");
        int day = sc1.nextInt();

        switch (day)
        {
            case 1:
                System.out.println("Monday!");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday!");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday!");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Only 7 days are there,inout outside the case!");
                break;
        }
        System.out.println("Switch finished outside the loop!");
    }
}
