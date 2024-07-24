package ex_20072024;

import java.util.Scanner;

public class Lab097_SwitchMultilpeCondition {
    // JDK > 13 in case muletiple conditions can be declared using comma.
    public static void main(String[] args) {
        Scanner sc1= new Scanner(System.in);
        System.out.println("Enter the itemcode:");
        int itemcode = sc1.nextInt();
        switch (itemcode)
        {
            case 001,002,003:
                System.out.println("The entered code is: "+itemcode+" and its type electronic");
                break;
            case 004,005,006:
                System.out.println("The entered code is: "+itemcode+" and its type Magnetic");
                break;
            default:
                System.out.println("None");

        }
        System.out.println("Exiting the loop");

    }
}
