public class Lesson22 {
    public static void main(String[] args) {
        final int MONTHES = 12;
        System.out.println(MONTHES);
    }
}

class Test {
    /*
     * Создаем для класса переменную, которая при
     * помощи "final" превращается в константу.
     * Атрибут "static" избавляет каждый раз ее инициализировать,
     * что сохраняет память.
     */
    public static final int CONSTANT = 73;
}
