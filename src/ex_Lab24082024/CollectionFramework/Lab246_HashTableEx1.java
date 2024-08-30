package ex_Lab24082024.CollectionFramework;

import java.util.Enumeration;
import java.util.Hashtable;

public class Lab246_HashTableEx1 {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht1 = new Hashtable<>();
        // Map
        // null
        // Synchronised
        // Slow
        // Legacy Class

        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");


        //
        Enumeration<Integer> e = ht1.keys();
        while (e.hasMoreElements()) {
            System.out.println(ht1.get(e.nextElement()));
        }


    }
}