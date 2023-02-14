public class Lesson21 {
    public static void main(String[] args) {
        Human h1 = new Human("Bob", 40);
        Human h2 = new Human("Tom", 30);
        // считаем людей
        h1.printNumberOfPeople();

        Human.description = "All human has two hands";
        h1.getAllFields();
        h2.getAllFields();
        Human.description = "All human has one head";
        h1.getAllFields();
        h2.getAllFields();

        Human h3 = new Human("Jack", 17);
        // считаем людей
        h1.printNumberOfPeople();

        // Math - класс со статическими методами
        System.out.println(Math.pow(2, 4));
        // Math - статические поля
        System.out.println(Math.PI);
    }
}

class Human {
    private String name;
    private int age;

    // статическое поле для подсчета количества хьюманов
    private static int countPeople;

    /*
     * Здесь объявляем поле static. Это поле будет принадлежать ко
     * всем объектам Human вроде, и всему классу одновременно.
     * Мы можем запускать статический метод вообще без объектов, как
     * статические методы класса Math и как статические поля (Math.PI).
     */
    public static String description;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        // функционал счетчика
        countPeople++;
    }

    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}
    public void getAllFields() {
        System.out.println(name + ", " + age + ", " + description);
    }
    public void printNumberOfPeople() {
        System.out.println("Now " + countPeople + " of people");
    }
}
