import java.util.Arrays;
public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        Person [] boy = new Person[3];
        boy[0] = new Person("Khalil");
        boy[1] = new Person("Diego");
        boy[2] = new Person("Cruz");
        for(Person person: boy){
            System.out.println(person.getName());
        }
    }
    public static Person[] addPerson(){
        Person[] boy = Arrays.addPerson(array.length + 1++);
        boy[array.length] = new Person;
        return boy;
    }
}

