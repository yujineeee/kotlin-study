package lecture06.java;

import java.util.List;

public class Lecture06Main {

    public static void main(String[] args) {

        List<Long> numbers = java.util.Arrays.asList(1L, 2L, 3L);
        for (long number : numbers) {
            System.out.println(number);
        }

        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }
    }

}
