package ex_14072024;

public class Lab079_Ternaryoperatorex1 {
    public static void main(String[] args) {
        //  Ternary operator.
        //  ? if true do this : ele do that

        int a =100;
        int b = 200;
        int result = (a>=b)?a:b;
        System.out.println(result);

        //ex2

        String s1 = "Say Hello";
        String s2= "Say hi";
        String result1 = (s1!=s2)?s1:s2;
        System.out.println(result1);
    }
}
