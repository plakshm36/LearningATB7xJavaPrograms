package ex_13072024;

public class Lab043_Relationaloperator {
    public static void main(String[] args) {
        // Relational Operators -> boolean
        //    // >, < >=,<=, == , != ( ! = ) - true or false.
        //relational operator works as a or gate

        int person1_age= 50;
        int person2_age= 60;
        boolean result1 = person1_age>person2_age;
        System.out.println(result1);
        boolean result2 = person1_age<person2_age;
        System.out.println(result2);
        boolean result3 = person1_age<=person2_age;
        System.out.println(result3);
        boolean result4 = person1_age>=person2_age;
        System.out.println(result4);
        boolean result5 = person1_age==person2_age;
        System.out.println(result5);
        boolean result6 = person1_age!=person2_age;
        System.out.println(result6);

        //example2 :directly giving the integer with the relational operator
        System.out.println("******************************");
        boolean c = (10 >= 10); // 10 > 10 or 10 = 10
        System.out.println(c);

        //example3 :inside sout without boolean declaration directly giving the integer with the relational operator
        System.out.println("******************************");
        System.out.println(10!=10);
        System.out.println( 10 == 10); // == Compare true values
        System.out.println( 10 >= 10); //  10> 10 or 10 = 10
        System.out.println( 10 <= 10); // 10 < 10 or 10 = 10
        System.out.println( 10 > 10);
        System.out.println( 10 < 10);

    }
}
