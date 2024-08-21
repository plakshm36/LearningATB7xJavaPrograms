package ex_Lab17082024.Exception;

public class Lab215_ExceptionEx6_Finally {
    public static void main(String[] args) {
        final double pi = 3.14;
        int a= 0;
        try {
            int x = 10/a;
        } catch (Exception e) {
            System.out.println("div by Zero");
        } finally {
            System.out.println("I will be executed anyHow!!");
        }

    }
}
