package ex_Lab17082024.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab221_ExceptionEx11_throwsmultiplecatch {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            int a = 10 / 0; // un - ar
        } catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
           catch (Exception e2) {
                System.out.println(e2.getMessage());
            } finally {
                System.out.println("FF");
            }

            FileReader f = new FileReader(new File("/Users/plakshm/Downloads/Ad1.mp4"));


        }

    }

