package lecture10.java;

public interface JavaFlyable {

    default void act() {
        System.out.println("파닥파닥");
    }


   // void fly();
}
