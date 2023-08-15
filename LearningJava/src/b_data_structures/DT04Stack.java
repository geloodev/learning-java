package b_data_structures;

import java.util.Stack;

public class DT04Stack {
    public static void main(String[] args) {
        
        // STACK:
        // - The Stack class represents a LIFO (Last In First Out)
        //   stack of objects.
        // - It extends class Vector with five operations that allow
        //   a vector to be treated as a stack.
        // - The usual push and pop operations are provided, as well
        //   as a method to peek at the top item on the stack, a
        //   method to test for whether the stack is empty, and a
        //   method to search the stack for an item and discover how
        //   far it is from top.

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Item on top of stack: " + stack.peek());
        System.out.println("Stack size: " + stack.size());
        System.out.println("Item on top that will be removed (pop): "  + stack.pop());
        System.out.println("Stack size after pop: " + stack.size());
        System.out.println("The stack is empty?: " + stack.empty());   
    }
}
