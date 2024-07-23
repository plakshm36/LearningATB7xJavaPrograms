package ex_20072024;

public class Lab098_Switcharrows {
    public static void main(String[] args) {
        // JDK > 13 while writing case if we use "arrows" instead of : no break is rquired just write the statements.
       // when using arrows no break is required.
        int itemCode = 001;

        switch (itemCode) {
            case 001 -> System.out.println("It's a laptop!");
            case 002 -> System.out.println("It's a desktop!");
            case 003, 004 -> System.out.println("It's a mobile phone!");
            default -> System.out.println("Heloo!");
        }

    }



}
