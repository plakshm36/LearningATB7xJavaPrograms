package ex_13072024;

public class Lab015_VariableDataTypeDec {
    public static void main(String[] args) {
    /* Variable Declaration-Syntax
    datatype variable_name(identifier)=variable_value(Literals);*/

        // Data Type-Primitive Data Type->1.boolean(true or false)

        boolean is_married= true;
        boolean are_youintrip=false;
        System.out.println(is_married);
        System.out.println(are_youintrip+"\n");

        // Data Type-Primitive Data Type->2.Numerical
        // integral - byte, short, int, long(long should be declared withL/l at the end)
         byte b = 127;
         short s = 3000;
         int i = 345000000;
         long l= 9223372036854775807L;
        System.out.println("The byte value is:"+b);
        System.out.println("The short value is:"+s);
        System.out.println("The integer value is:"+i);
        System.out.println("The long value is:"+l);



        //  char - char  - A,B
        char c ='A';
        System.out.println("The character is:"+c);

        // Data Type-Primitive Data Type->3.floating
        // float(long should be declared withF/f at the end)
        // double(double should be declared withD/d at the end)
        float f =3.145f;
        double d=455.21d;
        System.out.println("The float and double value is:"+f+"and"+d);




        // Non primitive Data Types
        // String  name -> "pramod" -, number or char or bunch of char
        //Type1 of string declaration
        String s1 = "Padmapriya Lakshminarayanan";
        System.out.println("\n The string value is:"+s1);
        //Type2 of string declaration
        String s2 = new String("Pranit");
        System.out.println("The second string value is:"+s2);


    }



}
