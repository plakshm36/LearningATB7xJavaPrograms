package ex_Lab04082024.Constructor;

public class Lab0165_InstanceVariable {

        int e= 45; // Instance Variable != Global Variable

        void f1(){
            int e = 10; // Local Variable
            System.out.println(e);
        }

        void f2(){
            e = 50;
            System.out.println(e);
        }


    }
