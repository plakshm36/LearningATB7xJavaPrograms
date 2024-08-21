package ex_Lab17082024.Exception;

public class Lab213_ExceptionEx5_throw {

    public static void main(String[] args) {
      /*try {
          String a = args[0];//ArrayIndexOutOfBoundsException
          int b = Integer.parseInt(a);//NumberFormatException
          int c = 1000 / b; //ArithmeticException
      }catch (ArithmeticException|NumberFormatException|ArrayIndexOutOfBoundsException e)
      {
          throw new RuntimeException(e);

      }

    }*/
        System.out.println("Start of the program");

        String ip = null; // ArrayIndexOutOfBoundsException
        try {
            ip = args[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }
        int a = 0; // NumberFormatException
        try {
            a = Integer.parseInt(ip);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
        int b = 0; // ArithmeticException
        try {
            b = 1000 / a;
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }
        System.out.println(b);
        System.out.println("End of the program");
    }
}
