package ex_Lab17082024.Exception;

public class Lab210_ExceptionEx2_CustomisedException {
    public static void main(String[] args) {


// Exception
// Checked - JVM knows -
//        try {
//            FileInputStream file = new FileInputStream("C://log.txt");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }


// UnChecked

      try{
          int a = 10;
          int c = a / 0;
      }catch (Exception e)
      {
          System.out.println("Error / by zero");
      }
        System.out.println("End of the program");



    }
}


