package ex_Lab10082024.Encapsulation;

import java.rmi.dgc.VMID;

public class VWOLoginPage {

    //instance variable should be declared private in encapsulation
    private String username;
    private String password;


    //constructor to assign local variables to instance variable.
    VWOLoginPage(String name,String psword)
    {
        this.username=name;
        this.password=psword;
    }
    //getter method to return the attributes.get represents getter method followed by a variable with captial letter.use
    //return always as getter returns the attribute.
    public String getUsername(){
        return username;

    }

    //setter method to take a parameter and assign the local variable to instnce variable.set represents setter method
    //followed by a capital letter of the variable.use this keyword to assign local to instance.
    public void setUsername(String name) {
        this.username=name;
    }

    public String getPassword(){
        return password;
    }

    //Also in case of setter method u can do a boolean check and procceed to assign parameters to attributes
    public void setPassword(String psword,boolean authenticatedadmin){
        if(authenticatedadmin)
        {
            this.password=psword;
        }
        else
        {
            System.out.println("The user is not an admin so cannot set the password!");
        }
    }


}
