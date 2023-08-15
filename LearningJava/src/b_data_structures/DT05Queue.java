package b_data_structures;

import java.util.LinkedList;
import java.util.Queue;

public class DT05Queue {

    public static void main(String[] args) {
        
        // QUEUE:
        // - FIFO (First In First Out)
        // - A collection designed for holding elements prior to processing.

        Queue<Person> supermarket = new LinkedList<>();

        supermarket.add(new Person("Ângelo", 20));
        supermarket.add(new Person("Filipe", 17));
        supermarket.add(new Person("Tatiana", 43));

        // peek() retrieve the head of the queue
        System.out.println("Front item: " + supermarket.peek());
        System.out.println("Queue size: " + supermarket.size());
        // poll() retrieve and remove the head of the queue
        System.out.println("Front item (removed): " + supermarket.poll());
        System.out.println("Front item after poll(): " + supermarket.peek());
        System.out.println("Queue size after poll(): " + supermarket.size());
    }

    static record Person(String name, int age) {}
}