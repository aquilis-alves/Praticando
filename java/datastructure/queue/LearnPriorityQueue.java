package datastructure.queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer("b");
        queue.offer("a");
        queue.offer("e");
        queue.offer("d");
        queue.offer("c");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
