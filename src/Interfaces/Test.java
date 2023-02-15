package Interfaces;

/**
 * Created by i2gan on 15.02.2023
 * Description: Интерфейс проверяет, что в разных
 * классах есть методы Info, позволяет создать
 * универсальный метод для разных классов.
 */

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Bob");
        outputInfo(animal1);
        outputInfo(person1);
    }
    public static void outputInfo(Info info) {
        info.showInfo();
    }
}
