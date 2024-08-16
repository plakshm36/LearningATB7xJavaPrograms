package ex_Lab11082024.Interface;

public class Lab0192_InterfaceEx1 {

        public static void main(String[] args) {
            Car c  = new Car();
            c.start();
            c.m1();
        }
    }

    //interface class

    interface Eng{
        void start();
        default void m1(){
            System.out.println("Old M1");
        }

        default void suite(){
            System.out.println("wear suite");
        }
    }

//interface class extending another interface class

    interface GearBox extends Eng{
        void gear();

    }

//interface class extending another interface class
    interface Keys extends GearBox{
        void openCar();
    }


//normal class implements interface class and its methods
    class Car implements Keys {

        @Override
        public void start() {
            System.out.println("Starting");
        }

        @Override
        public void gear() {

        }

        @Override
        public void openCar() {

        }
    }

