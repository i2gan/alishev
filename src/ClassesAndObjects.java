public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Roman";
        person1.age = 50;
        person1.message();

        Person person2 = new Person();
        person2.name = "Vlad";
        person2.age = 20;
        person2.message();
    }
}

class Person {
    String name;
    int age;

    void message() {
        System.out.println("My name " + name + " I'm " + age + " years old.");
    }
}
