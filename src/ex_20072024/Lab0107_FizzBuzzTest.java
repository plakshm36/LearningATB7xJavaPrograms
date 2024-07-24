package ex_20072024;

import java.util.Scanner;

public class Lab0107_FizzBuzzTest {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter any number from 1 to 100:");
        int value = sc1.nextInt();
        Fizzbuzztest(value);


    }

   public static void Fizzbuzztest(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) {
            System.out.println("The entered number is a Fizzbuzz number");
        } else if (number % 3 == 0) {
            System.out.println("The entered number is a Fizz number");
        } else if (number % 5 == 0) {
            System.out.println("The entered number is a buzz number");
        } else {
            System.out.println("The entered number is not a Fizzbuzz number");
        }
    }
}






