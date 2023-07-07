package a_fundamentals.b_conditionals_and_loops;

public class ConditionalsAndLoops {
    
    public static void main(String[] args) {
        // CONDITIONALS
        // if statement: is used to test if a particular condition is true or false
        int num = 1;

        if (num == 1) {
            // do something
        }

        // if-else statement: is used to execute a block of code if a specified
        // condition is true, and another block of code if its false
        if (num == 1) {
            // do something
        } else {
            // do other thing
        }

        // ternary operator: shorthand verson of if-else
        String output = (num%2 == 0) ? "even number" : "odd number";

        // switch case statement: used for specific cases of values
        switch (output) {
            case "even number":
                // do something
                break;
            case "odd number":
                // do something
                break;
            default:
                // do something different for a non-case value
                break;
        }

        /* 
        // enhanced switch (Java 14 or higher):
        switch (output) {
            case "even number" -> do something;
            case "odd number" -> do something;
            default -> do something;

        }
        */


        // LOOPS
        // for loop:
        // for (initialization; condition; increment/decrement) {...}
        System.out.println("FOR LOOP: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Java is fun");
        }

        //for-each loop:
        // for (type nameEach : nameArray) {...}
        System.out.println("FOR-EACH LOOP: ");
        int[] numbers = {3, 7, 5, -5};
        for (int number : numbers) {
            System.out.println(number);
        }

        // while loop: executes a block of code as long as the
        // condition is true;
        // while (conditon) {...};
        System.out.println("WHILE LOOP: ");
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // do-while loop: executes a block of code and repeats the loop
        // until the condition is false.
        // do {...} while (condition);
        System.out.println("DO-WHILE LOOP: ");
        do {
            System.out.println(i);
            i++;
        } while (i < 5);

        
        // BREAK AND CONTINUE
        // break: stops and exit loops or switch statements
        System.out.println("BREAK: ");
        for (int v = 1; v <= 10; v++) {
            System.out.println(v);
            if (v < 5) break;
        }

        // continue: ignore all below it, and go to the beginning
        // of the loop again
        System.out.println("CONTINUE: ");
        for (int a = 1; a <= 10; a++) {
            System.out.println("before " + a);
            if (a > 5) continue;
            System.out.println("after " + a);
        }
    }
}
