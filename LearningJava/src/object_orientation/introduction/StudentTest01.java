package object_orientation.introduction;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Luffy";
        student.age = 21;
        student.gender = 'M';
        
        System.out.println("ESTUDENT 01:");
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);

        System.out.println("-------------");

        // Instances with the same reference
        Student student2 = student;

        System.out.println("ESTUDENT 02:");
        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gender);
    }
}
