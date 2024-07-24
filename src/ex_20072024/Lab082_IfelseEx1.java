package ex_20072024;

public class Lab082_IfelseEx1 {

    // Condition and Loops
    // Condition ?
    // age  > 18 -> you allowed to / Vote
    //  if age > 18 -> vote, else -> not allowed.
    // syntax
//        if (condition ==> true or false){
//          statements;
//        }else{
//       statements;
//        }
    public static void main(String[] args) {
        int age = 18;
        if(age>18)
        {
            System.out.println("You are allowed to vote!");
        }
        else{
            System.out.println("Your are not allowed to vote!");
        }
    }

}
