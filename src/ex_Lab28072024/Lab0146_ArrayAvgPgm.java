package ex_Lab28072024;

import java.util.Scanner;

public class Lab0146_ArrayAvgPgm {
    public static void main(String[] args) {

        // Where we take the user input of the 5 subjects - Avg of the subject.
        // Figure inputs - float, scanner class

        Scanner sc = new Scanner(System.in);
        float[] score = new float[5];

        for (int i = 0; i < score.length; i++) {
            System.out.println("Enter the score for each subject->Score:" + (i + 1));
            score[i] = sc.nextFloat();

        }
        for (int i = 0; i < score.length; i++) {
            System.out.println("Score of Subject" + (i + 1) + " is:" + score[i]);
        }

        float avg = (score[0] + score[1] + score[2] + score[3] + score[4]) / 5;
        System.out.println("\n The average score is:"+avg);



    }
}
