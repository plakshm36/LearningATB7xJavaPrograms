package ex_Lab24082024.CollectionFramework;

public class Lab249_GenericEx2 {
    public static void main(String[] args) {
        sum(5,7);

        temp("Pramod");
        temp(123);
        temp(true);

        sum1(3,4);
        sum1("pramod","dutta");

        // T - Ref to the Data Type that you want to use.

    }
    // T - Ref to the Data Type that you want to use.

    public static <T> T sum(int a,int b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }

    //u can also mention anything instead of T if you dont know the datatype.refer below
    public static <pramod> pramod sum1(pramod a, pramod b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }

    public static <Dutta> void temp(Dutta name) {
        System.out.println(name);
    }
}
