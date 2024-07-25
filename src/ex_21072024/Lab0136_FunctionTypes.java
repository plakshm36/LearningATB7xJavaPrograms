package ex_21072024;

public class Lab0136_FunctionTypes {
    public static void main(String[] args) {
        // Functions
        // Block of code which we can reuse.
        // 1. Pre-built - Math.max()
        // 2. User created / defined

        // Two component of the functions
        // 1. Define
        // 2. Call the function

        //  1.Without Parameters and Without Return Type
        // 2.Without Parameters but With Return Type
        // 3.With Parameters and Without Return Type
        // 4. With Parameters and With Return Type

        // Call the functions
        func1();
        String var1 = func2();
        func3("Padmapriya");
        int result = func4(10,20);
    }
   // 1.Without Parameters and Without Return Type
    public static void func1()
    {
        System.out.println("Type 1:Without Parameters and Without Return Type\n ");
    }

    // 2.Without Parameters but With Return Type
    public static String func2()
    {
        System.out.println("Type 2: Without Parameters but With Return Type\n");
        return "StringPadma";
    }

    // 3.With Parameters and Without Return Type

    public static void func3(String name)
    {
        System.out.println("Type 3:With Parameters and Without Return Type");
        System.out.println("You have shared -> " + name+"\n");
    }


    // 4. With Parameters and With Return Type
    public static int func4(int a,int b)
    {
        System.out.println("Type 4: With Parameters and With Return Type");
        System.out.println(a+b+"\n");
        return a+b;
    }
}
