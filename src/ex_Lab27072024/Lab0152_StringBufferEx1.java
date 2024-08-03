package ex_Lab27072024;

public class Lab0152_StringBufferEx1 {  public static void main(String[] args) {
    // Strings - imutable in nature
    // StringBuilder , StringBuffer
    String s1 = "PRAMOD";
    s1 = "Dutta";

    StringBuffer stringBuffer = new StringBuffer("Pramod");
    // change the value of string - Buffer
    System.out.println(stringBuffer.append("Dutta"));  //PramodDutta
    System.out.println(stringBuffer.append("JI")); //PramodDutta

    StringBuilder stringBuilder = new StringBuilder("Amit");
    System.out.println(stringBuilder.append("Sharma"));

    // Thead Safty?

    // stringBuilder - not thread safe - people LOVE it :)


}
}