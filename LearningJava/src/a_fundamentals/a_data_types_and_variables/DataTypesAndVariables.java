package a_fundamentals.a_data_types_and_variables;

public class DataTypesAndVariables {

    // static variable:
    // memory location happens only once when the class is loaded in the memory.
    static int m = 100;

    // instance variable:
    // declares inside the class but outside the body of the method.
    // it is called an instance because its value is instance-specific
    // and is not shared among instances.
    int data = 50;

    // local variable:
    // declared inside the body of the method. 
    // can be used only with that method.
    // cannot be defined with static.
    void method() {
        int n = 90;
    }

    public static void main(String[] args) {
        
        //VARIABLES
        // type name = value (default form)

        // boolean
        // range: true or false
        // default value: false
        // default size: 1 bit
        boolean bool = true;

        //char (for characters)
        // range: '\u0000' (or 0) to '\uffff' (or 65,535)
        // default value: '\u0000'
        // default size: 2 bytes
        char c  = 'v';

        // byte (smaller than int)
        // range: -128 to 127
        // default value: 0
        // default size; 1 byte
        byte b = 10;

        // short (smaller than int)
        // range: 32,768 to 32,767
        // default value: 0
        // default size: 2 bytes
        short s = 120;
        
        // int
        // range: -2^31 to 2^31-1
        // default value: 0
        // default size: 4 bytes
        int a = 2;

        // long (bigger than int)
        // range: -2^63 to 2^63-1
        // default value: 0L
        // default size: 8 bytes

        // float (for float point and smaller than double)
        // range: unlimited
        // default value: 0.0f
        // default size: 4 bytes
        float pi = 3.14f;

        // doubble (for float point)
        // range: unlimited
        // default value: 0.0d
        // default size: 8 bytes
        double d = 20.22d;

        
    }
}
