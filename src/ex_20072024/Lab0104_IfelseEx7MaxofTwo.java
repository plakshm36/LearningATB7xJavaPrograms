package ex_20072024;


import java.util.Scanner;

public class Lab0104_IfelseEx7MaxofTwo {
    //Program to Find the Largest Among Three Numbers:

    public static void main(String[] args) {
        Scanner sc1 =  new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc1.nextInt();
        Scanner sc2 =  new Scanner(System.in);
        System.out.println("Enter the second number:");
        int num2 = sc2.nextInt();
        Scanner sc3 =  new Scanner(System.in);
        System.out.println("Enter the third number:");
        int num3 = sc3.nextInt();

        if(num1>num2&&num1>num3)
            {
                System.out.println("The number1 is greater than number2 and number3");
            }
        else if (num2>num1&&num2>num3)
        {
            System.out.println("The number2 is greater than number1 and number3");
        }
        else
            {
                System.out.println("The number3 is greater");
            }
    }
}

