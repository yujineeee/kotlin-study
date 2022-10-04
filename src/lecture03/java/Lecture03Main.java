package lecture03.java;


import lecture01.Person;

public class Lecture03Main {

    public static void main(String[] args) {

    }

    public static void printAgeIfPerson(Object obj) {
        if (obj instanceof Person) {
            Person person = (Person) obj;
            System.out.println(person.getName());
        }

        if (!(obj instanceof Person)) {
            Person person = (Person) obj;
            System.out.println(person.getName());
        }
    }

}
