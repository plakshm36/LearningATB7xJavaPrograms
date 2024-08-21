package ex_Lab17082024.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab217_ExceptionEx7 {
    public static void main(String[] args) {
        try {
            int a = 10 / 0; // Uncheck Ath E
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            FileReader f = new FileReader(new File("c://a.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("I will be executed anyHow!! but not in case of throw ");
        }

    }
}
