package ex_Lab04082024.SingleInheritance;

public class Lab0172 {
    public static void main(String[] args) {

        //As the class son-child class extended to father-parent class all the methods present in son and father can be called.
        Son s= new Son();
        s.bhk3();
        s.bhk2();


        Father f1 = new Father();
        f1.bhk2();

    }
}
