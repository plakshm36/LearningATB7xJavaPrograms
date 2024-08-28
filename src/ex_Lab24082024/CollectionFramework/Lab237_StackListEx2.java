package ex_Lab24082024.CollectionFramework;

import java.util.Stack;

public class Lab237_StackListEx2 {
    public static void main(String[] args) {

                // Vector, Stack - Legacy - 95% of time we are not going to use it in automation
                // legacy? - old ->

                Stack s = new Stack();
                //using push to add the element
                s.push("Pramod");
                s.push("Dutta");
                s.push("Amit");
                s.add("Amit2");
                System.out.println(s);
                //peek returns the last item of the Vector object .
                System.out.println(s.peek());
                // pop()-access and remove the last element
                System.out.println(s.pop());
                System.out.println(s);




            }
        }

