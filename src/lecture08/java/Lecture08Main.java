package lecture08.java;

public class Lecture08Main {

    public static void main(String[] args) {

    }

    public int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public void repeat(String str, int num, boolean useNewLine) {
        for (int i = 1; i <= num; i++) {
            if (useNewLine) {
                System.out.println(str);
            } else {
                System.out.print(str);
            }
        }
    }

    //오버로딩 사용
    public void repeat(String str, int num) {
        repeat(str, num, true);
    }

    //오버로딩 사용 - 메소드를 3개나 만들기가..
    public void repeat(String str) {
        repeat(str, 3, true);
    }

    //가변인자
    public static void printAll(String... strings) {
        for (String str : strings) {
            System.out.println(str);
        }
    }

}
