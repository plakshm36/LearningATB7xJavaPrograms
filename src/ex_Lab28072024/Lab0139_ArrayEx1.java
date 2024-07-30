package ex_Lab28072024;

import java.util.Scanner;

public class Lab0139_ArrayEx1 {

    public static void main(String[] args) {
        int[] marks = new int[10];
        System.out.println(marks[0]); //this line will print 0 because the value is not defined.

        //getting input from user is also possible in array as below
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for array1");
        marks[0] = sc.nextInt();
        //here directly gave value for array variables
        marks[1]=50;
        marks[2]=100;
        System.out.println("The mark present in 0 index is:"+marks[0]);
        System.out.println("The mark present in 1 index is:"+marks[1]);
        System.out.println("The mark present in 2 index is:"+marks[2]);
        System.out.println("\n");
        //To print in loop
        for(int i=0;i<marks.length;i++)
        {
            System.out.println("Printing array values using for loop:"+marks[i]);
        }
        System.out.println("\n");
        //boolean datatype in arrays

        boolean[] is_married={true,false};
        //strings in array

        String[] days={"Sunday", "Monday", "Tuesday", "Wednesday"};
        for(int i =0;i< days.length;i++)
        {
            System.out.println("The days present in the week are:"+days[i]);
        }

    }
}
