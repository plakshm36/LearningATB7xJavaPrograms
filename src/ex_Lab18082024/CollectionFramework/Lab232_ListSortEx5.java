package ex_Lab18082024.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Lab232_ListSortEx5 {
    public static void main(String[] args) {
        ArrayList marks = new ArrayList();
        marks.add(91);
        marks.add(95);
        marks.add(56);
        marks.add(89);
        System.out.println(marks);
//        Collections.sort(marks);
        Collections.sort(marks, Comparator.reverseOrder());
        System.out.println(marks);

    }
}
