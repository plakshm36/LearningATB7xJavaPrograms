package ex_20072024;

import java.util.Scanner;

public class Lab087_IfelseEx5EvenOdd {
    public static void main(String[] args) {
        // Take user input and check if number id even or odd.



        // Logic Building - Ready
        // 1. Figure out the inputs &  // 2. Data type
        //  Data type  - . int
        // How to take input in the Java? - Scanner - class -
        // nextInt() -> input


        // 3. Do we need conversion or direclty
        // 4. Rough logic - num%2==0 even,odd
        // 5. optimize
        // int - size - 32 bit -> range( 2,147,483,647)
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1= sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the Second number:");
        int num2= sc2.nextInt();

        if(num1%num2==0)
        {
            System.out.println("The given number is a Even num");
        }
        else
        {
            {
                System.out.println("The given number is a odd num");
            }
        }
    }
}
