package ex_14072024;

public class Lab057_Typecastingnarrowingex3 {
    public static void main(String[] args) {
        long phone_no = 9876543210L;
        // short s = phone_no; // automatic conversion big to small so narrowing implicit casting
        short s = (short) phone_no;//manual conversion big to small so narrowing explicit casting
        System.out.println(s);
        // JVM - GC -

    }
}
