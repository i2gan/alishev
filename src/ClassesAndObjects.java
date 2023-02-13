public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Romario");
        person1.setAge(33);
        System.out.println("Getting name in main method: " + person1.getName());
        System.out.println("Getting age in main method: " + person1.getAge());
        person1.message();
    }
}

class Person {
    private String name;
    private int age;

    public void setName(String userName) {
        if (userName.isEmpty())
            System.out.println("Enter Name");
        else
            name = userName;
    }
    public String getName() {
        return name;
    }

    public void setAge(int userAge) {
        if (userAge < 0)
            System.out.println("Age must be > 0");
        else
            age = userAge;
    }
    public int getAge() {
        return age;
    }

//    void setUserData(String username, int userage) {
//        name = username;
//        age = userage;
//    }

    void message() {
        System.out.println("My name is " + name + ", I'm " + age + " years old.");
    }
}