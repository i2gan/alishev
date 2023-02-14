public class Lesson_23 {
    public static void main(String[] args) {
        // конкатенация строк по уму
        // подходит для множественных соединений
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my");
        sb.append(" friend");
        System.out.println(sb.toString());

        // то же самое, но короче
        StringBuilder sb2 = new StringBuilder("Hi");
        sb2.append(" beautifull").append(" world!");
        System.out.println(sb2.toString());
    }
}
