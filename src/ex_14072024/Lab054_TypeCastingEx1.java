package ex_14072024;

public class Lab054_TypeCastingEx1
{
    public static void main(String[] args) {

        //lower to higher happening automatically so imlicit casting
        byte a = 10;
        byte b = 23;
        int c = a+b;
        System.out.println(c);

        //If given as char c = a1+b1 it will display error because char belongs to integer type datatype.
        // Either you should do implicit casting int c1=a1+b1 or widening explicit casting char c1 = (char) (a1+b1)

        char a1 = 'A';
        char b1 = 'B';
        int c1 =  (a1+b1); // AB ->char
        //char c1 = (char)(a1+b1); if manually converted and if lower to higher or loer to lower its widening
        System.out.println(c1); //(65+66)
        System.out.println('A' == 65);
        System.out.println('B' == 66);
    }
}
