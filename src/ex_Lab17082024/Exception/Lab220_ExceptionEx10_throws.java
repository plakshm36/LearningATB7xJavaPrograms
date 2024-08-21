package ex_Lab17082024.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab220_ExceptionEx10_throws {
    public static void main(String[] args) throws FileNotFoundException,ArithmeticException  {
        readFile();
    }

    private static void readFile() throws FileNotFoundException,ArithmeticException {
        System.out.println("Hello Padma");
        String path = "/Users/plakshm/Downloads/Ad1.mp4";
        File file = new File(path);
        FileReader fileReader = new FileReader(file);

        // read the file txt it can read the file
        System.out.println("End of the program");


    }
}