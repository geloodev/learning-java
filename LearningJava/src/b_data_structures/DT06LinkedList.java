package b_data_structures;

import java.util.LinkedList;
import java.util.ListIterator;

public class DT06LinkedList {
    
    public static void main(String[] args) {
        
        // LINKEDLIST:
        // - A series of nodes, where each node has a
        //   reference for the next nor previous node
        // - Is a implementation of Queue

        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Ângelo", 20));
        linkedList.add(new Person("Filipe", 17));
        // addFirst() adds a node on the head of the linked list
        linkedList.addFirst(new Person("Tatiana", 43));
        // addFirst() adds a node on the tail of the linked list
        linkedList.addLast(new Person("Cookie", 1));

        ListIterator<Person> personListIterator = linkedList.listIterator();
        System.out.println("Normal iteration:");
        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }
        System.out.println("Reverse iteration:");
        while (personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous());
        }
    }

    static record Person(String name, int age) {}
}
