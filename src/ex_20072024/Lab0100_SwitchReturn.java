package ex_20072024;

import java.util.Scanner;

public class Lab0100_SwitchReturn {
    //JDK13 yield is similar to return.when using yield keyword it behaves similar to return and returns a value.when
    //yield is used no break is required.
    public static void main(String args[]){
        Scanner sc1 =  new Scanner(System.in);
        System.out.println("Enter the character and return its integer value:");
        char ch = sc1.next().charAt(0);

        int val= switch (ch)
        {
            case 'A','a':
                yield 100;
            case 'B','b':
                yield 200;
            default:
                throw new IllegalStateException("Unexpected value: " + ch);
        };
        System.out.println("The returned value is:"+val);
        sc1.close();


    }
}
