package ex_20072024;

import java.util.Scanner;

public class Lab094_Switchex3vowel {
    public static void main(String[] args) {
        // Take a user input as char and Tell the user if it is a vowel
        // aeiou
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the character:");
        char vowel = sc1.next().charAt(0);


        switch (vowel) {
            case 'a', 'A':
                System.out.println("The entered character is:" +vowel + " and its a vowel!");
                break;
            case 'e','E':
                System.out.println("The entered character is:" +vowel + " and its a vowel!");
                break;
            case 'i','I':
                System.out.println("The entered character is:" +vowel + "and its a vowel!");
                break;
            case 'o':
            case 'O':
                System.out.println("The entered character is" + vowel + "and its a vowel!");
                break;
            case 'u','U':
                System.out.println("The entered character is" + vowel + " and its a vowel!");
                break;
            default:
                System.out.println("The entered character is not a vowel!");
                break;
        }
        System.out.println("Exiting the loop!");
        sc1.close();

        }
    }

