package datastructure.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<String>();

        System.out.println(queue.isEmpty());

        queue.offer("Jorge");
        queue.offer("Fernando");
        queue.offer("Andre");
        queue.offer("Mariana");

        System.out.println(queue.isEmpty());
        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.contains("Thiago"));

        System.out.println(queue.peek());
        queue.poll();

        System.out.println(queue);

    }
}
