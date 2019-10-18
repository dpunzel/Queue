package queueExample;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    /**
     *  We insert the items at the end of the queue and are
     *  removed from the beginning.
     *
     *  FIFO structure
     *
     * java.util.LinkedList
     * java.util.PriorityQueue
     *
     * Application: breadth-first-search
     */

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Joe");
        queue.add("Bob");
        queue.add("Kelly");

        for (String s : queue)
            System.out.println(s);

        System.out.println("---------------------------");

        System.out.println(queue.remove());

        System.out.println("---------------------------");

        for (String s : queue)
            System.out.println(s);

        System.out.println("---------------------------");

        System.out.println(queue.size());
        // returns the element but does not remove it.
        System.out.println(queue.element());
        System.out.println(queue.size());

    }
}
