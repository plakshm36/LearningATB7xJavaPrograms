package ex_20072024;

import java.util.Scanner;

public class Lab085_IfelseEx4Multilpes {
    public static void main(String[] args) {
        boolean a = false;
        a = !a;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1= sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the second number:");
        int num2= sc2.nextInt();

        if(num1%num2==0)
        {
            System.out.println("num1 is a multiple of num2");

        }
        else
        {
            System.out.println("num1 is not a multiple of num2");
        }
        System.out.println("\n Outside the loop-->"+a);

    }
}
