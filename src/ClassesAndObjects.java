public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Roman";
        person1.age = 50;

        Person person2 = new Person();
        person2.name = "Vlad";
        person2.age = 20;

        int years1 = person1.calculateYearsToRetirement();
        int years2 = person2.calculateYearsToRetirement();

        System.out.println(years1 + " years for 1-st man to retirement");
        System.out.println(years2 + " years for 2-nd man to retirement");
    }
}

class Person {
    String name;
    int age;

    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
    }

    void message() {
        System.out.println("My name " + name + " I'm " + age + " years old.");
    }
}