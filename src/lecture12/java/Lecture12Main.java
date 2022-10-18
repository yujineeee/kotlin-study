package lecture12.java;

import lecture12.kotlin.Person;

public class Lecture12Main {

    public static void main(String[] args) {
        //Person.Companion.newBaby("ABC");
        Person.newBaby("ABC");
        Person.Factory.newBaby("ABC222");

        moveSomting(new Movable() {

            @Override
            public void move() {
                System.out.println("움직인다.");
            }

            @Override
            public void fly() {
                System.out.println("난다.");
            }
        });
    }
    private static void moveSomting(Movable movable) {
        movable.move();
        movable.fly();
    }
}

