package lecture01.java;

import lecture01.Person;

import java.util.Arrays;
import java.util.List;

public class Lecture01Main {

    public static void main(String[] args) {
        long number1 = 10L;
        final long number2 = 10L;

        Long number3 = 1_000L;
        Person person = new Person("장유진");

        final List<Integer> numbers = Arrays.asList(1,2);
        numbers.add(3);
    }

}
