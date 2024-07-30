package ex_Lab28072024;

public class Lab0149_2DEx1 {
    public static void main(String[] args) {
        int[][]  array2d={{10,20,30},{40,50,60},{70,80,90}};

        for(int i=0;i<array2d.length;i++)
        {
        for(int j=0;j<array2d[i].length;j++)
        {
            System.out.print(array2d[i][j]);
            System.out.print("\t");
        }
            System.out.println("\n");
        }

    }


}
