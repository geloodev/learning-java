package c_object_orientation.a_association;

public class School {
    private String name;
    // Association N to 1
    // N Professors have 1 School
    private Professor[] professors;

    public School(String name) {
        this.name = name;           
    }

    // overloaded constructor
    public School(String name, Professor[] professors) {
        this.name = name;
        this.professors = professors;
    }

    public void print() {
        System.out.println(this.name);
        if (professors == null) return;
        for (Professor professor : professors) {
            System.out.println(professor.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
