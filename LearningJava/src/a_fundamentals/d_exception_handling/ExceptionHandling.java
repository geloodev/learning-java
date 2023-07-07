package a_fundamentals.d_exception_handling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling {

    public void validateAge(int age) {
        if (age < 18) {
            // throw:
            // Used when you want to generate and raise an exception manually.
            throw new IllegalArgumentException("Age must be at least 18");
        }
    }

    // throws:
    // Used in method signatures to declare that a method might throw one or more types
    // of exceptions. It specifies the exceptions that can be thrown by a method,
    // allowing the calling code to be aware of and handle those exceptions appropriately.
    public void readFile(String filename) throws FileNotFoundException, IOException {
        // do something
    }

    public static void main(String[] args) {
        // Exception Handling in Java is a mechanism that allows you to handle and
        // manage errors and exceptional conditions that may occur during the execution
        // of a program. Execptions represent abnormal situations or errors than can
        // disrupt the normal flow of code execution. By handling, you can gracefully
        // recover from errors and take appropriate actions.

        // code that may throw and exception
        try {
            int myInt = Integer.parseInt("abc");
        }
        // code to handle the exception 
        catch (Exception e) {    
            System.out.println("It is not a number!");
            e.getMessage();
        }
        // code that always execute, regardless of whether an exception occurred or not 
        finally {
            System.out.println("This is the finally block.");
        }
    }
}

// User-created Exception
class UserException extends Exception {
    int a;

    UserException(int a) {
        this.a = a;
    }

    public String toString() {
        return("Exception number = " + a);
    }
}
