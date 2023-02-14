/*
 * по умолчанию при выводе строки на экран
 * срабатывает невидимый метод toSting().
 * Если выводить на экран объект, в данном случае m1,
 * выводится уникальный идентификатор, абракадабра.
 * Для вывода в форме, необходимой пользователю, этот метод
 * нужно переопределить
 */
public class Lesson24 {
    public static void main(String[] args) {
        Man m1 = new Man("Tom", 40);
        System.out.println(m1); // "Tom, 40"
    }
}

class Man {
    private String name;
    private int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // переопределение метода toString()
    public String toString() {
        return name + ", " + age;
    }
}
