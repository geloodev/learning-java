package a_fundamentals.c_methods;

public class Methods {
    private int id;
    private int[] list;
    private static int[] staticList;

    // INSTANCE INITIALIZATION BLOCK
    // Executes when a new object is intantiated. This code executes before
    // the constructor.
    {
        list = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = i + 1;
        }
    }

    // STATIC INITIALIZATION BLOCK
    // The code will be executed once, because they work for the class, not
    // for the instances of this class.
    static {
        staticList = new int[10];
        for (int i = 0; i < staticList.length; i++) {
            staticList[i] = i + 1;
        }
    }

    // INSTANCE METHOD:
    // Before calling or invoking the instance method, it is necessary to
    // create an object (instance) of its class.
 
    // getter
    public int getId() {
        return id;
    }

    // setter
    public void setId(int id) {
        this.id = id;
        // the keyword 'this' refers to the attribute of the current class
    }

    // STATIC METHOD:
    // It is a method that belongs to a class rather than an instance of a
    // class. We can call it without create a object (instance). All static
    // methods are factory methods.
    public static void myStaticMethod() {
        // do something
    }

    // ABSTRACT METHOD:
    // Does not have method body and always declares in the abstract class
    public abstract class Example {
        public abstract void myAbstractMethod();
    }

    // VARARGS
    // Pass a array directly in the method parameters without create a array
    // previously.
    public void sumVarargs(int... numbers) {
        for (int num: numbers) System.out.println(num);;
    }
    
    public static void main(String[] args) {
        // CALLING INSTANCE METHOD
        Methods myClass = new Methods();
        myClass.getId();
        myClass.setId(1);

        // CALLING STATIC METHOD
        Methods.myStaticMethod();

        //USING VARARGS
        // 'new int[]' is not needed
        myClass.sumVarargs(1, 2, 3);
    }
}
