package b_object_orientation.a_association;

public class SchoolTest {
    public static void main(String[] args) {
        Professor professor = new Professor("Jyraya");
        Professor professor2 = new Professor("Kakashi");
        Professor[] professors = {professor, professor2};
        School school = new School("Konoha", professors);

        school.print();
    }
}
