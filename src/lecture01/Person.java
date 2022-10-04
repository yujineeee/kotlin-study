package lecture01;

import com.sun.istack.internal.NotNull;

public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    @NotNull
    public String getName() {
        return name;
    }
}
