package ex_20072024;


import java.util.Scanner;

public class Lab093_SwitchEx2Browser {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the browser name:");
        String browserName = sc1.next();
        browserName = browserName.toLowerCase();

        switch (browserName)
        {
            case "chrome":
                System.out.println("Starting the chrome browser!");
                break;
            case "firefox":
                System.out.println("Starting the firefox browser!");
                break;
            case "edge":
                System.out.println("Starting the edge browser!");
                break;
            default:
                System.out.println("Dont have such browser!");
                break;
        }
        System.out.println("Exiting the loop!");
        sc1.close();
    }
}
