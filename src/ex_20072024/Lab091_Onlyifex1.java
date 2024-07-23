package ex_20072024;

public class Lab091_Onlyifex1 {
    public static void main(String[] args) {
// if executes line by line so if the first if itself becomesfalse it will skip remaining conditions.
        if (false) {
            System.out.println("1");
            if (true) {
                System.out.println("2");
                if (true) {
                    System.out.println("3");
                }
            }
        }

    }
}

