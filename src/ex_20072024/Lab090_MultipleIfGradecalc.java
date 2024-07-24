package ex_20072024;

import java.util.Scanner;

public class Lab090_MultipleIfGradecalc {
 //      ✅ Grade Calculator:
//        Write a program that calculates and displays
//        the letter grade for a given numerical
//        score (e.g., A, B, C, D, or F)
//        based on the following grading scale:
//        A: 90-100
//        B: 80-89
//        C: 70-79
//        D: 60-69
//        F: 0-59


    // 1. Find the user Inputs
    // score - data type? - int -90
    // return -> grade - data-type - char  - A
    //         // // DAA- Ask for the confirmation of the doubts
    // Interviewer ->  int, char
    // Scanner - >

    // 2. Basic Logic
    // if ( score >= 90 && score <= 100 ) -> return or print grade - A
    // else if score <=89 && score >= 80 -> return or orint grade - B
    // else if score <=79 && score >= 70 -> return or orint grade - C
    // D,E
    //  // else -> grade -> F

    public static void main(String[] args) {
        Scanner sc1= new Scanner(System.in);
        System.out.println("Enter the Score:");
        int score = sc1.nextInt();
        char grade;
        if(score>=90 && score<=100){
           grade = 'A';

        } else if (score<=89&& score>=80) {
            grade = 'B';

        } else if (score<=79 && score>=70) {
            grade = 'C';

        }
        else
        {
            grade = 'F';
        }

        System.out.println("Your grade is:"+grade);
        sc1.close();
    }

}
