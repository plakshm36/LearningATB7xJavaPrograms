package ex_Lab24082024.CollectionFramework;

import java.util.PriorityQueue;

public class Lab243_QueueEx1 {
    public static void main(String[] args) {
        // Queue - < 1% in Automation
        //
        PriorityQueue pq= new PriorityQueue();
        pq.offer("1"); // add
        pq.offer("3");
        pq.offer("2");
        pq.offer("4");
        System.out.println(pq);
      /*  offer() this function similar to add() in list.
        peek()-access first person in the list
        poll()-access and remove the first person in the list */

        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);


    }
}
