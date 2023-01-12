package grades;
import java.util.ArrayList;
import java.util.List;
public class Student {
    private String name;
    private ArrayList<Integer> grades;



    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }


    public void addGrade(int grade){
       this.grades.add(grade);
    }



    public double getGradeAverage() {
       double sum = 0;
        for (int grade:this.grades) {
            sum += grade;
        }
        return sum/grades.size();
    }

    public static void main(String[] args) {

        Student student1 = new Student("Brion");
        System.out.println(student1.getName());
        student1.addGrade(82);
        student1.addGrade(78);
        System.out.println(student1.grades);
        System.out.println(student1.getGradeAverage());

    }

}
