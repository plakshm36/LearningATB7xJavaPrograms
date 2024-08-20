package ex_Lab17082024.WrapperClass;

public class Lab198_WrapperEx4 {
    public static void main(String[] args) {
        Double d = 3.14; // HEAP
        double val = d.doubleValue(); // CM
        System.out.println(d);
        System.out.println(val);

        String s1 = "pramod"; // SCP
        String s2 = new String("pramod"); // HEAP
    }


}
