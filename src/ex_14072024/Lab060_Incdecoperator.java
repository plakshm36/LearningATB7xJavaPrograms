package ex_14072024;

public class Lab060_Incdecoperator {
    public static void main(String[] args) {
        // Increment (++) / Decrement (--) Operators
        // Pre and Post


        // pre - increment ++operand
        // value is incremented first and then stored in the result.
         int a = 10;
         int b = ++a; // a = a+1; Exp = 11 , a = 11
         System.out.println("Expression of 'a' after Pre-Increment operator is :"+a);
         System.out.println("Value of 'b' after Pre-Increment operator is :"+b);



         int c = 10;
        System.out.println("\nValue of 'c' after Pre-Increment operator is:"+(++c));

        // POST increment orator
        //  value is stored in the result and incremented later
        int a_post = 10;
        System.out.println("\nExpression of 'a_post' after Post-Increment operator is :"+(a_post++));// Exp = 10 , a = 11
        System.out.println("Value of 'a_post' after Pre-Increment operator is :"+(a_post));

    }
}
