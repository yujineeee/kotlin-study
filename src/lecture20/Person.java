package lecture20;


public class Person {
    private final String name;
    private int age;

    private String hobby;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
}
