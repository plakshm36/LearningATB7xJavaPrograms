package ex_14072024;

public class Lab059_Typecastingex5 {
    public static void main(String[] args) {
       int course = 100;
        float GST = 18.45F;
        float total_price = course+GST;//small to big automatic so implicit widening
        System.out.println(total_price);


    }

}
