package ex_Lab17082024.NestedClass;

public class Lab202_NonStaticInnerClassEx1 {
        public static void main(String[] args) {
            Car c = new Car("Lambo");
            c.drive();
            // to access the inner class Object creation.
            Car.GearBox cg = c.new GearBox();
            cg.m2();


        }
    }
    class Car {
        private String make;

        public Car(String make) {
            this.make = make;
        }

        // Method
        void drive() {
            System.out.println("You can driver Car");
        }

        class GearBox {
            void m2() {
                System.out.println("m2");
            }
            class NutBolts{

            }

        }


    }

