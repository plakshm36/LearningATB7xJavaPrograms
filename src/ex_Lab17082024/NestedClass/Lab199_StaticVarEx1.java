package ex_Lab17082024.NestedClass;

public class Lab199_StaticVarEx1 {

    public static void main(String[] args) {
        //static doesnt need obj creation
        //static will be executed by default followed by IIB

        A a = new A();

        a.age = 12;
        System.out.println(A.discount);
        a.m1();
        A.m2(); // Static
    }
}
    class A{

        //instance variable
        int age = 20;
        //static variable
        static int discount = 10;
        ////////////////////////////////////////////////////////

        //normal method

        void m1()
        {
            System.out.println("This is a normal method");
        }

        //static method
        static void m2()
        {
            System.out.println("This is a static method");
        }

       ////////////////////////////////////////////////////////////////

        //static block
        static
        {
            System.out.println("This is a static block and it will be executed first");
        }

        //default block IIB - instance initialization block

        {
            System.out.println("IIB When Object is created & after static it will be executed");
        }


    }

