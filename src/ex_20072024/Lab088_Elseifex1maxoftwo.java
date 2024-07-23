package ex_20072024;



import java.util.Scanner;

public class Lab088_Elseifex1maxoftwo {
    public static void main(String[] args) {
        // Max number in two inputs
        Scanner sc1=  new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc1.nextInt();

        Scanner sc2=  new Scanner(System.in);
        System.out.println("Enter the Second number:");
        int num2 = sc2.nextInt();

        if(num1>num2)
        {
            System.out.println("num1 is  greater than num2");
        } else if (num2>num1) {
            System.out.println("num2 is greater than num1");

        }
        else{
            System.out.println("Both num1 & num2 are equal");
        }

    }


}
