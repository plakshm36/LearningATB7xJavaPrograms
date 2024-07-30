package ex_Lab28072024;

import java.util.Scanner;

public class Lab0147_MaxMinSalariesClassEx1 {
    // Find the Max in the Arrays
    // Find the Max Salary, Min  in the Salary Array

    public int max(int [] salaries) {
        int max = salaries[0];
        for(int i=0; i<salaries.length; i++ ) {
            if(salaries[i]>max) {
                max = salaries[i];
            }
        }
        return max;
    }

    public int min(int [] salaries) {
        int min = salaries[0];

        for(int i = 0; i<salaries.length; i++ ) {
            if(salaries[i]<min) {
                min = salaries[i];
            }
        }
        return min;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] salaries = new int[5];
        System.out.println("Enter the Salary ::");
        for(int i=0; i<salaries.length; i++) {
           salaries[i] = sc.nextInt();
            System.out.println("The entered salary is:"+salaries[i]);
        }
        Lab0147_MaxMinSalariesClassEx1 m = new Lab0147_MaxMinSalariesClassEx1();
        System.out.println("Maximum value in the array is::"+m.max(salaries));
        System.out.println("Minimum value in the array is::"+m.min(salaries));
    }
}