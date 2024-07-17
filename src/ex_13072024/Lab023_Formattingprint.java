package ex_13072024;

public class Lab023_Formattingprint {
    public static void main(String[] args) {
      //  Formatting -how to print different data tyes using formatting option in sout
        // %d ->  any integer - byte, short, int or long
        // %s -> String
        // %c -> char
        // %f -> float
        //%f  ->double

        byte x = 110;
        short s = 3429;
        char c = '&';
        int r = 34562;
        long q = 894245945455L;
        float f = 345.356567f;
        double d = 235656.235656566d;
        String str3="Testing";//Lab026

        System.out.printf("Formatted print:\n %d\n%d \n %c \n %d \n %d \n %f \n%f \n%s",x,s,c,r,q,f,d,str3);


    }
}
