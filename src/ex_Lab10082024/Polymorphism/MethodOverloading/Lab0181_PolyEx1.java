package ex_Lab10082024.Polymorphism.MethodOverloading;

public class Lab0181_PolyEx1 {
    public static void main(String[] args) {
        MathOperations obj1 =  new MathOperations();
       obj1.add(2,3);
        obj1.add("Test1","Test2");
        obj1.add(2,"Test3");
        obj1.add(2.5,3.5);
        obj1.add(5,4,3);
        obj1.add(5,4,3,6);

    }
}
