package lecture01.kotlin

import lecture01.Person

fun main() {
    var number1: Long = 10L //가변 변수 var / 타입은 추론되며 : 뒤에 타입을 지정해줄 수 있음
    val number2 = 10L // 불변 변수 val

    //initialize
    var numberNotInitalized: Long
    numberNotInitalized = 10L
    println(numberNotInitalized) //초기화를 해주어야함

    //primitive
    // - 코틀린이 알아서 숫자/불리언/문자에 대해서는 Boxing/unBoxing 처리해줌
    var primitiveNumber1 = 10L
    var primitiveNumber3 = 1_000L

    //nullable
    var nullableNumber: Long? = 1_000L
    nullableNumber = null

    //객체
    var person = Person("장유진") //new를 붙이지 않는다
}