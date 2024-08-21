package ex_Lab17082024.Exception;

import java.util.Scanner;

public class Lab223_ExceptionEx13_UserInput {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        if (!name.equalsIgnoreCase("test")){
            try {
                throw new Exception("Not allowed!!");
            } catch (Exception e) {
                System.out.println("Exception!!");
            }
        }else {
            System.out.println("Not Allowed to execute exception block as String matched!");
        }
    }
}
       /* Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        try {
            if( x == 0){
                throw new ArithmeticException("Enter non zero number");
            }
            int a  = 10/x;
            System.out.println(a);
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }
    }
}*/
