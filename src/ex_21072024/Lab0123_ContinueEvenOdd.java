package ex_21072024;

public class Lab0123_ContinueEvenOdd {
    public static void main(String[] args) {
        for(int i=0;i<=50;i++)
        {
            if(i%2==0){
                System.out.println("Even numbers are:"+i);
                continue;
            }
            System.out.println("\nOdd numbers are:"+i);
        }
    }
}

