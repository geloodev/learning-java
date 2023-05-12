package b_object_orientation.b_inheritance;

public class Employee {

    // with "protected", all the classes in this
    // package can access these attributes
    protected String name;
    protected String socialSecurityNumber;
    protected Address address;
    protected double salary;

    public Employee(String name, String socialSecurityNumber, Address address, double salary) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.address = address;
        this.salary = salary;
    }

    public void print() {
        System.out.println(name);
        System.out.println(socialSecurityNumber);
        System.out.println(address.getStreet() + " " + address.getZipcode());
        System.out.println("R$"+salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
