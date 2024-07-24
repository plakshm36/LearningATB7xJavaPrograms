package ex_14072024;

public class Lab078_StringFunc {
    public static void main(String[] args) {
        String username = "Padmapriya Lakshminaryanan";
        String username_lw= username.toLowerCase();
        System.out.println("The lowercase string is:"+username_lw);

        System.out.println("\n"+username==username_lw);
        System.out.println(username.equals(username_lw));
        System.out.println(username.equalsIgnoreCase(username_lw));

        System.out.println(username.substring(5,10));
        System.out.println(username.indexOf(10));
        System.out.println(username.length());
    }
}
