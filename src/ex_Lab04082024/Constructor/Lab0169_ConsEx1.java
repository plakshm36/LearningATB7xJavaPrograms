package ex_Lab04082024.Constructor;

public class Lab0169_ConsEx1 {
    public static void main(String[] args) {
      /*  Constructor can be called only when we type “new” keyword.In Java, a Constructor
        is a block of code similar to a method. It is called when an instance of a class is created.
        Constructors must have the same name as the class in which they are defined,
        this is not necessary for a Java method.Constructors do not return any type, while methods
        have a return type or void if they do not return any value.Constructors are called only once
        when an object is created, while methods can be called any number of times.*/


       /*ConsEx1_ATBPerson obj1=new ConsEx1_ATBPerson();
        new ConsEx1_ATBPerson("Sanjay");
        new ConsEx1_ATBPerson("Sanjay",123456789);
*/

        //or do like below by creating object for each constructor

        ConsEx1_ATBPerson obj1=new ConsEx1_ATBPerson();
        ConsEx1_ATBPerson obj2=new ConsEx1_ATBPerson("Sanjay");
        ConsEx1_ATBPerson obj3=new ConsEx1_ATBPerson("Pranit",123456789);
        System.out.println("Constructor 1 called:"+"\n"+obj1.name);
        System.out.println("Constructor 2 called:"+"\n"+obj2.name);
        System.out.println("Constructor 3 called:"+"\n"+obj3.name);
        System.out.println(obj3.phonenumber);


    }
}
