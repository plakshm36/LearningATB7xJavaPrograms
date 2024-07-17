package ex_13072024;

public class Lab025_Stringdecconcatenation {
    public static void main(String[] args) {
      //Concatenation of 2 integers
        int s1=23;
        int s2= 456;
        System.out.println("************************************************************************************************");
        System.out.println("2 integer will be concatenated when + symbol and strings present:"+s1+s2);
        System.out.println(s1+s2);
        System.out.println("When 2 integer given directly in sout result will be sum of 2 numbers:");

        //"String" datatype declaration,concatenation,concatenation of string+int
         System.out.println("************************************************************************************************");
         String str1= "Padmapriya";
         String str2 = "Lakshminaraynan";
         System.out.println("+ symbol will concatenate 2 strings:"+str1+str2);

        //Concatenation of string and integer
        String s3 = "Amit";
        int x = 99;
        int y = 100;
        System.out.println(x+y+s3);
        System.out.println(s3+x+y);
        System.out.println(x+s3+y);
        System.out.println(x+y+s3+y+s3+x+y);


    }
}
