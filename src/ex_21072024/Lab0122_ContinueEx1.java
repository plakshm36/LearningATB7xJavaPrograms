package ex_21072024;

public class Lab0122_ContinueEx1 {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++)
        {
            System.out.println(i);
            if(i==5)
            {
                continue;

            }
            System.out.println("When continue condition gets false this will be printed if true this will not be printed");
            System.out.println("****************************************************************************************");

         }

    }
}
