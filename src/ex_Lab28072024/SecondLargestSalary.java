package ex_Lab28072024;

import java.util.Scanner;

public class SecondLargestSalary {

    //Reference program:https://www.youtube.com/watch?v=wt3uFB0SgHY

    public float[] firstSecondMax(float[] salaries){
       float largest=0 ;
       float secondLargest=0;
       float[] result = new float[2];
        for(int i =0;i<salaries.length;i++)
        {
            if(salaries[i]>largest){
                secondLargest=largest;
                largest=salaries[i];


            } else if (salaries[i] > secondLargest && salaries[i] != largest) {
                secondLargest=salaries[i];
            }
        }

        result[0] = largest;
        result[1] = secondLargest;
        return result;
      //return new Result(largest,secondLargest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] salariesUserInput = new float[5];
        for (int i = 0; i <  salariesUserInput.length; i++) {
            System.out.println("Enter the Salaries:");
            salariesUserInput[i] = sc.nextFloat();
        }
        sc.close();
        for (int i = 0; i <  salariesUserInput.length; i++) {
            System.out.println("Entered salaries are:" +  salariesUserInput[i]);
        }
        //calling method(firstSecondMax) using object declaration
        SecondLargestSalary obj1=new SecondLargestSalary();
        float[] result1 = obj1.firstSecondMax(salariesUserInput);
        System.out.println("Largest: " + result1[0] + ", Second Largest: " + result1[1]);

    }
}
