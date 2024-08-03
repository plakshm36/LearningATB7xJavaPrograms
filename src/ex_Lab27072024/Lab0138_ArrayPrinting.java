package ex_Lab27072024;

public class Lab0138_ArrayPrinting {

    public static void main(String[] args) {
      //  int[] marksTenth= new int[100];
        // marksTenth[0]=100;

        int[] marksTenth = {90,100,40,30,20};

        int[] marks_10_board = {90, 91, 95, 99, 100, 78};
        System.out.println(marks_10_board.length); //gives length of array size
        System.out.println(marks_10_board[3]); // 99
        System.out.println(marks_10_board[0]); // 90
        System.out.println(marks_10_board[-1]); // ArrayIndexOutOfBoundsException
//        System.out.println(marks_10_board[10]);

    }
}
