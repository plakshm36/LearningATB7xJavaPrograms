package ex_Lab18082024.CollectionFramework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Lab234_ArrayListIteratorEx1 {
    public static void main(String[] args) {
        ArrayList<String> mylist = new ArrayList();
        mylist.add("Pramod");
        mylist.add("Amit");
        mylist.add("Dutta");

        System.out.println(" - To Print Arraylist - 1 ");

        for (String str : mylist) {
            System.out.println(str);
        }

        System.out.println(" - To Print Arraylist - 2 ");

        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }

        System.out.println(" - To Print Arraylist - 3 ");

        // Iterator
        Iterator<String> its = mylist.iterator();
        while(its.hasNext()){
            System.out.println(its.next());
        }


    }
}
