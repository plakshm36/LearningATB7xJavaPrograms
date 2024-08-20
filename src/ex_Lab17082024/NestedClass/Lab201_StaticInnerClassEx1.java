package ex_Lab17082024.NestedClass;

public class Lab201_StaticInnerClassEx1 {
    public static void main(String[] args) {
        OuterClass.InnerClass obj1 = new OuterClass.InnerClass();
        obj1.run();
    }

    //static nested class
    public class OuterClass{

        private static int x = 1;

        public static class InnerClass {

            private void run() {
                // method implementation
            }
        }



    }
}
