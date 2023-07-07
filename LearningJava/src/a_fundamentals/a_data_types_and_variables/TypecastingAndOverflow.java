package a_fundamentals.a_data_types_and_variables;

public class TypecastingAndOverflow {
    public static void main(String[] args) {
        
        // TYPECASTING OR NARROWING:
        // Is the process of converting a value of one data type
        // into another data type.
        float f = 10.5f;

        // 'int a = f;' causes compile time error
        int i = (int) f;

        System.out.println("f = " + f);
        System.out.println("i = " + i);

        // OVERFLOW:
        // Occurs when a value is too large or too small to be
        // represented by a particular data type.
        int a = 130;
        byte b = (byte) a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
