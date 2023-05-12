package b_object_orientation.b_inheritance;

public class Manager extends Employee {
    private String department;

    public Manager(String name, String socialSecurityNumber, Address address, double salary, String department) {
        super(name, socialSecurityNumber, address, salary);
        this.department = department;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(department);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
