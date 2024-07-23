package ex_20072024;

import java.util.Scanner;

public class Lab0106_Triangleclassifier {
    public static void main(String[] args) {
        System.out.println("Enter the Side1 value:");
        Scanner sc1 = new Scanner(System.in);

        double side1 = sc1.nextDouble();
        System.out.println("Enter the Side2 value:");
        Scanner sc2 = new Scanner(System.in);
        double side2 = sc2.nextDouble();
        System.out.println("Enter the Side3 value:");
        Scanner sc3 =  new Scanner(System.in);
        double side3 = sc3.nextDouble();

        if((side1==side2)&&(side2==side3)&&(side3==side1))
        {
            System.out.println("The triangle is a equilateral triangle");
        } else if ((side1==side2)||(side2==side3)||(side3==side1)) {

                System.out.println("The triangle is a isosceles triangle");
        }
        else
        {

            System.out.println("The triangle is a scalen triangle");
        }

    }
}
