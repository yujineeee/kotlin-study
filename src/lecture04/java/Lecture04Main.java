package lecture04.java;

public class Lecture04Main {

    public static void main(String[] args) {
        JavaMoney money1 = new JavaMoney(2000L);
        JavaMoney money2 = new JavaMoney(1000L);

        if (money1.compareTo(money2) > 0) {
            System.out.println("Money1이 Money2보다 금액이 큼뉘다");
        }


        //동등성
        JavaMoney moneyA = new JavaMoney(1000L);
        JavaMoney moneyB = moneyA;
        JavaMoney moneyC = new JavaMoney(1000L);

        System.out.println(moneyA == moneyB); //true
        System.out.println(moneyA == moneyC); //false


        //연산자
        System.out.println(money1.plus(money2));
    }


}
