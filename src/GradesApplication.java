import grades.Student;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {

            HashMap<String, Student> students = new HashMap<>();
            Student Brion = new Student("Brion");
            Brion.addGrade(82);
            Brion.addGrade(78);
            Brion.addGrade(98);

            Student Micheal = new Student("Micheal");
             Micheal.addGrade(88);
             Micheal.addGrade(85);
             Micheal.addGrade(98);

            Student DeAndre = new Student("DeAndre");
            DeAndre.addGrade(81);
             DeAndre.addGrade(93);
             DeAndre.addGrade(100);

            Student Adrian = new Student("Adrian");
            Adrian.addGrade(87);
            Adrian.addGrade(97);
             Adrian.addGrade(100);

        System.out.println(Brion.getGradeAverage());
        System.out.println(Micheal.getGradeAverage());
        System.out.println(DeAndre.getGradeAverage());
        System.out.println(Adrian.getGradeAverage());

            students.put("juiceDrop08", Brion);
            students.put("iWantmilk", Micheal);
            students.put("frenchCut", DeAndre);
            students.put("Applesauce", Adrian);


        }
    }



