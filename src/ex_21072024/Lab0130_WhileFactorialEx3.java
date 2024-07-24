package ex_21072024;

import java.util.Scanner;

public class Lab0130_WhileFactorialEx3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer number n:");
        int n = sc.nextInt();
        factorial(n);
    }

    public static void factorial(int n){
        int fact =1;
        for(int i=1;i<=n;i++)
            fact=fact*i;
        System.out.println(fact);
    }

}