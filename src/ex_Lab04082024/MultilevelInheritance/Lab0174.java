package ex_Lab04082024.MultilevelInheritance;

public class Lab0174 {
    public static void main(String[] args) {
        // Multi Level
        // GF -> F -> Child
        Child c1 = new Child();
        c1.home(); // If name is same C -> F -> GF
        c1.c();
        c1.gf();
        c1.f();
    }

}
