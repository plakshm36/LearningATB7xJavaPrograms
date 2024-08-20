package ex_Lab17082024.WrapperClass;

public class Lab196_WrapperToPrimitEx2 {
    public static void main(String[] args) {
        int a =100;
        Integer b =a;

        // Integer.MAX_VALUE
        System.out.println(a);
        System.out.println(b);// extra utilities are added.
        System.out.println(b);// extra utilities are added.
        // Wrapper class to Primitive
        Integer a2 = 42; // Auto Boxing - int -> Integer
        int value = a2; //  UnBoxing - Integer -> int
        System.out.println(a2);
        System.out.println(value);
    }
}
