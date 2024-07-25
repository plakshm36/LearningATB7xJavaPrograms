package ex_21072024;

public class Lab0135_FunctionEx1 {

    public static void main(String[] args) {
        // Functions
        // Block of code which we can reuse.
        // 1. Pre-built - Math.max()
        // 2. User created / defined

        // Two component of the functions
        // 1. Define
        // 2. Call the function

        //  Call the function
        for(int i=0;i<=10;i++)
        {
            func1();
        }

         func2();
    }
    // 1. Define

    public static void func1()
    {
        System.out.println("Test1");
    }

    public static void func2(){
        System.out.println("Test2");
    }
}
