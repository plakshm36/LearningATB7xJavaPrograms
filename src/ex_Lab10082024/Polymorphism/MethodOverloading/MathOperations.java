package ex_Lab10082024.Polymorphism.MethodOverloading;

public class MathOperations {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //different way opf constructor

   MathOperations()
    {
        System.out.println("Default Constructor");
    }

    MathOperations(String a,String b)
    {

    }
    MathOperations(int a, int b)
    {

    }

    MathOperations(int a, int b,int c)
    {

    }
    MathOperations(int a ,int b,int c,String d)
    {

    }


    int add(int a,int b)
    {
        return a+b;
    }
    // Method Overloading-same method name but different type of arguments or different number of arguments.
    int add(int pramod, int dutta, int amit, int mehga) {
        return pramod + dutta;
    }

    void add(int a, int b, int c) {
        System.out.println("Hello");
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(double a, double b, float f) {
        return a + b + f;
    }

    String add(String a, String b) {
        return a + b;
    }

    String add(String a, int b) {
        return a + b;
    }

    String add(int b, String a) {
        return a + b;
    }

}
