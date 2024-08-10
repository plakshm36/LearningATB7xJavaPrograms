package ex_Lab04082024.Constructor;

public class ConsEx1_ATBPerson {

    String name;
    long phonenumber;
//  Constructors must have the same name as the class in which they are defined,

    //default constructor
    ConsEx1_ATBPerson() {
        System.out.println("The default constructor is created");
        name= "Padma";


    }

    //parameterized constructor and that variables are assigned to instance variable
    ConsEx1_ATBPerson(String nameP1)
    {
        this.name=nameP1;
    }

    //parameterized constructor and that variables are assigned to instance variable
    ConsEx1_ATBPerson(String nameP2,long phNum){
        this.name=nameP2;
        this.phonenumber=phNum;
    }
}
