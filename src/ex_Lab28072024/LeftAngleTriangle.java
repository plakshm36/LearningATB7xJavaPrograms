package ex_Lab28072024;

public class LeftAngleTriangle {

/*Downward Triangle Star Pattern

      public static void main(String[] args) {
            int i,j,row=5;
            for(i=0;i<=row;i++){
                for(j=0;j<row-i;j++){
                    System.out.print("* ");
                }
                System.out.println("");
            }

        }
    }*/


public static void main(String[] args) {
    int i,j,row=5;
    for(i=0;i<=row;i++){
        for (j=2*(row-i); j>=0; j--)
        {

            System.out.print(" ");
        }

        for(j=0;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println("");
    }

}
    }


