package datastructure.linkedlist;

import java.util.LinkedList;

public class LearnLinkedList {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<String>();

        /* this is a stack
        linkedList.push("a");
        linkedList.push("b");
        linkedList.push("c");
        linkedList.push("d");
        linkedList.push("e");
        linkedList.pop();
         */

        // this is Queue
        linkedList.offer("a");
        linkedList.offer("b");
        linkedList.offer("c");
        linkedList.offer("d");
        linkedList.offer("e");
        linkedList.poll();

        linkedList.add(4, "f");
        System.out.println(linkedList);

        linkedList.remove("f");

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("0");
        linkedList.addLast("g");
        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();

        System.out.println(linkedList);
        System.out.println(first);
        System.out.println(last);

    }
}
