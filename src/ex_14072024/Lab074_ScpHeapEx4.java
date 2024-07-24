package ex_14072024;

public class Lab074_ScpHeapEx4 {
    public static void main(String[] args) {
        String name = "The Testing Academy"; // SCP
        String name1 = "The Testing Academy"; // SCP

        String name2 = new String("The Testing Academy"); // Heap area (OA)

       System.out.println(name == name1); // Check for the Ref and returns true as both strings are present in string constant pool
       System.out.println(name1.equals(name2)); // Check for the Content and returns true as both strings are same


       /* System.out.println(name1 == name2); // Check for the Ref
        System.out.println(name1.equals(name2)); // Check for the Content*/
    }

}
