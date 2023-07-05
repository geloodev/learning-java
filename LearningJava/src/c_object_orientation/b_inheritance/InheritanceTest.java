package c_object_orientation.b_inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Address address = new Address("12th Ave", "12345");
        Employee employee = new Employee("Ângelo", "12121212", address, 1200);
        employee.print();

        System.out.println("-----------------");

        Manager manager = new Manager("Manager 1", "98989898", address, 9000, "TI");
        manager.print();
    }
}
