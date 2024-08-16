package ex_Lab11082024.Static;

public class Lab0193 {
    // Static
    // block
    // Data member or variables
    // Function
    // Class

    public static void main(String[] args) {
        ATB a1 = new ATB("amit");
        System.out.println(a1.getName());
    }
}


class ATB{

    //default block
    {
        System.out.println("IIB");
        // What is the purpose? -
        // Here you can write code related to
        // start a webite or anything before starting the
        // web automation or api automation
        //
        System.out.println("Reading from CSV file");
    }

    //static block
    static {
        System.out.println("Load the class?, I will execute");
    }



    private String name;
    private String phone;
    //static variables or data member
    static String courseName = "ATB";

    //encapsulation getter
    public String getName() {
        return name;
    }
    //encapsulation setter
    public void setName(String name) {
        this.name = name;
    }

    //constructor
    public ATB(String name) {
        this.name = name;

    }

    //static methods
    static void doAssignment(){
        System.out.println("Do Assignment");
    }

    //static class
    static class A{

    }
}