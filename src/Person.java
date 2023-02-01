
//1. Object basics
public class Person {
    private String name;

    public String getName() {
        return String.format("%s", name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.printf("Hello, from %s.%n", name);
    }

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person adrian = new Person("Person Adrian");
        adrian.sayHello();
        adrian.setName("Adrian Ramirez");
        System.out.println(adrian.getName());

    }


        //1. Understanding references

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());







}






