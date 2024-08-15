package ex_Lab10082024.Super;

public class Lab0183 {

    // super()
    //1. Use of super with Variables
    //2. Use of super with Methods
    //3. Use of super with constructors

    // super keyword in Java is a reference variable that allows
    // a subclass - child class
    // to refer to its parent class.
    public static void main(String[] args) {
        car obj1 = new car();
        obj1.display();
    }
}

class car extends Vechicle{
    private int min_speed = 100;

    car(){
        //using super keyword calling a construtor present in parent class
        super(10);
        System.out.println("This is a default constructor present in subclass");
    }

    public void display()
    {
        System.out.println("Car speed is:"+this.min_speed);
        System.out.println("Vechicle speed is:"+super.max_speed);
        this.message();
        super.message();

    }

    //Method overriding

    @Override
    void message() {
        System.out.println("This is Method overridden present in subclass");
    }
}
class Vechicle{

   public int max_speed=300;

    Vechicle()
    {
        System.out.println("This is default constructor present in Super/Parent class");
    }

    Vechicle(int a)
    {
        System.out.println("This is parameterised constructor present in Super/Parent class");
    }

     void message()
     {
         System.out.println("This is a method with no return present in Super/Parent class");
     }

     void message(int a)
     {
         System.out.println("This is parameterized method with no return typre present in Super/Parent class");
     }

}
