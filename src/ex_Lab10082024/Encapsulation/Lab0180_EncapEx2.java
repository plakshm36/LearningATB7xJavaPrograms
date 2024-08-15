package ex_Lab10082024.Encapsulation;

public class Lab0180_EncapEx2 {

    public static void main(String[] args) {
        ICICIBank obj1 = new ICICIBank("Papri",1000000);
        System.out.println(obj1.getName());
        System.out.println(obj1.getBal(true));

        obj1.setName("Pranit",true);
        System.out.println(obj1.getName());
        obj1.setBal(50000000,true);
        System.out.println(obj1.getBal(true));
    }
}
