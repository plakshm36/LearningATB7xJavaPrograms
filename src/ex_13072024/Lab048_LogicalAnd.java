package ex_13072024;

public class Lab048_LogicalAnd {
    public static void main(String[] args) {
        //  And  && // Logical And only true && true returns true
        // T || T -> T
        // T || F -> F
        // F || T -> F
        // F || F -> F

        System.out.println(true&&true);
        System.out.println(true&&false);
        System.out.println(false&&true);
        System.out.println(false&&false);

         int a =100;
         int b= 200;
         int c = 300;
        System.out.println("The value of variables are->\n"+"a="+a+";b="+b+";c="+c);
        if((a>b)&&(b<c))
        {
            System.out.println(a+b+c);
                    }
        else{
            System.out.println(c-a);
        }
    }
}
