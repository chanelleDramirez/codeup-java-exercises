import grades.Student;

public class StudentTest {
    public static void main(String[] args) {

        Student student1 = new Student("Brion");
        System.out.println(student1.getName());
        student1.addGrade(82);
        student1.addGrade(78);
        System.out.println(student1.getGradeAverage());

    }

}
