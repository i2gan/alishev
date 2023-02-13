public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setUserData("Roman", 27);
        person1.message();
    }
}

class Person {
    String name;
    int age;

    void setUserData(String username, int userage) {
        name = username;
        age = userage;
    }

    void message() {
        System.out.println("My name is " + name + ", I'm " + age + " years old.");
    }
}