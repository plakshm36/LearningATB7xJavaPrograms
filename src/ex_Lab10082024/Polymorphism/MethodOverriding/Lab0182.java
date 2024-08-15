package ex_Lab10082024.Polymorphism.MethodOverriding;

public class Lab0182 {
    // Method overidding | Runtime Poly
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();

       //its a subclass which has same method name& parameters of superclass.If the method of superclass overrided here in subclass
        //if it has own blocks it will be executed else if user uses "super" keyword then suerclass blocks will be executed.
        Hound h1 = new Hound();
        h1.bark();
        h1.bike();


     //if subclass assigned to superclass object reference then superclass method blocks will be executed.
        Dog dog_Ref = new Hound();
        dog_Ref.bark(); // Overriden Functions


        //Hound h2 = new Dog();

    }
}

