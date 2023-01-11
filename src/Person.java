public class Person {
    private String name;

    public String getName() {
        return String.format("%s", name);
    }

    public void setName(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.printf("Hello, from %s.%n", name);
    }
    public Person(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Person adrian = new Person("Person adrian");
        adrian.sayHello();
        adrian.setName("Adrian Ramirez");
        System.out.println(adrian.getName());
    }
}



//TODO: return the person's name



//TODO: change the name field to the passed value


//TODO: print a message to the console using the person's name
