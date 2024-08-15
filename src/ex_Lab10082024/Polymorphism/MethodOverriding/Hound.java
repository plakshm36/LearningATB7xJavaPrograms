package ex_Lab10082024.Polymorphism.MethodOverriding;

public class Hound extends Dog {

  @Override
    void bark() {
        System.out.println("I am Hound, i will Bark!!");
    }

    /*@Override
    void bark() {
        super.bark();
    }*/

    void bike(){
        System.out.println("Biked");
    }

}

