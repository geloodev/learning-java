package b_object_orientation.a_introduction_classes;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "Luffy";
        professor.age = 21;
        professor.gender = 'M';
        
        System.out.println(professor.name);
        System.out.println(professor.age);
        System.out.println(professor.gender);
    }
}