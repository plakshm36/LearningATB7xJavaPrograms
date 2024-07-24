package ex_20072024;

import java.util.Scanner;

public class Lab108_LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:");
        int leapyear = sc.nextInt();
        Leapyear(leapyear);


    }

    public static void Leapyear(int year) {
        // flag to take a non-leap year by default
        boolean leap = false;
        // If year is divisible by 4
        if (year % 4 == 0) {
         leap = true;
          // To identify whether it is a century year or not && Checking if year is divisible by 400 therefore century leap year
         if (year % 100 == 0)
          {
            if(year % 400 == 0)
            leap = true;
            else
            leap = false;

         }
        }
        // We land here when corresponding if fails If year is not divisible by 4
        else
        {
            leap = false;
        }
       if(leap)
       {
           System.out.println(year+" year is a leap year");
       }
       else
       {
           System.out.println(year+" year is not a leap year");
       }
    }

}