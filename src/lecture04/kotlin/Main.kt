package lecture04.kotlin

import lecture04.java.JavaMoney

fun main() {
    val money1 = JavaMoney(2000L)
    val money2 = JavaMoney(1000L)

    if(money1 > money2) {
        println("Money1이 Money2보다 금액이 큼뉘다")
    }

    //동등성
    val moneyA = JavaMoney(2000L)
    val moneyB = moneyA
    val moneyC = JavaMoney(2000L)

    println(moneyA === moneyB) //주소 확인 - true
    println(moneyA === moneyC) //false
    println(moneyA == moneyC) //값 확인 - equals 호출

    //논리연산자
    if (fun1() || fun2()) {
        println("본문")
    }

    //연산자 오버로딩
    val moneyKotlin1 = Money(1000L)
    val moneyKotlin2 = Money(2000L)
    println(moneyKotlin1 + moneyKotlin2)
}

fun fun1(): Boolean {
    println("fun 1")
    return true
}

fun fun2(): Boolean {
    println("fun 2")
    return true
}
