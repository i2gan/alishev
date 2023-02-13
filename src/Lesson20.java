public class Lesson20 {
    public static void main(String[] args) {
        Human human1 = new Human("Bob", 22);
    }
}

class Human {
    private String name;
    private int age;

    /*
     * Здесь созданы три конструктора. Один без параметров, второй с одним
     * параметром, третий с двумя параметрами. При создании объекта в классе
     * main, если параметры не заданы, можно использовать параметры по умолчанию.
     * Если параметры заданы - программа выбирает подходящий конструктор.
     */

    public Human() {
        this.name = "John Doe";
        this.age = 99;
        System.out.println("My name is " + name + ". I'm " + age + " years old.");
    }
    public Human(String name) {
        this.name = name;
        System.out.println("This is second constuctor.");
        System.out.println("Hello, " + this.name + "!");
    }
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Hello from third constructor.");
        System.out.println("My name is " + name + ", I'm " + age + " years old.");
    }

    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}

}
