package ex_Lab10082024.Encapsulation;

public class Lab0178_EncapEx1 {
    public static void main(String[] args) {
        VWOLoginPage obj1 = new VWOLoginPage("Padmapriya","Test123");
        //to see what username print it.
        System.out.println(obj1.getUsername());
        //set new username and print it.
        obj1.setUsername("Newname");
        System.out.println(obj1.getUsername());


        System.out.println(obj1.getPassword());
        obj1.setPassword("Test456",false);
        System.out.println(obj1.getPassword());
    }



}
