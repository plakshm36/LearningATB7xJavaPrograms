package ex_Lab11082024.Abstraction;

public class Lab188_AbstractionEx1 {

    public static void main(String[] args) {
        Son s1 = new Son();
        s1.loan50k();

        Father f1 =  new Son();
        f1.loan25k();
        f1.loan50k();
    }
}
