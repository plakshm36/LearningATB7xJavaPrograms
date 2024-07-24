package ex_13072024;

public class Lab047_LogicalOr {
    public static void main(String[] args) {
        // || - OR if any one condition is true it will execute.if both condition false it will be false.

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        //example:
        int a=10;
        int b =20;
        int c=30;
        System.out.println("\nThe variable values are->\n"+"a="+a+":b="+b+":c="+c);
        if((a>b)||(a==c))
        {
            System.out.println(a+b+c);
        }
        else
        {
            System.out.println(b-a);
        }
    }
}
