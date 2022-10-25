package lecture16.kotlin

import lecture16.Person

fun main() {
    /*
    * 1. 확장 함수
    * */
    val person = Person("A", 100)
    person.nextYearAge() // 확장이 먼저 불릴까? 멤버가 불릴까? => 멤버가
    //시그니처가 동일하면 멤버가 불린다.


    // 해당 변수의 현재 타입 - 정적인 타입에 의해 어떤 확장함수가 호출될지 결정된다
    // Train의 확장 함수 vs Srt의 확장 함수

    /*
   * 2. infix 함수
   * */
    3.add(4)
    3.add2(4)
    3 add2 4 //<-요거..


    /*
     * 3. inline 함수
     * */
    3.add3(4)

    /*
     * 4. 지역함수
     * */
    //
    //depth가 깊어지기도 하고 코드가 깔끔하지도 않음

}


fun Person.nextYearAge(): Int {
    println("확장 함수")
    return this.age + 1
}

infix fun Int.add(other: Int): Int {
    return this + other
}

infix fun Int.add2(other: Int): Int {
    return this + other
}


inline fun Int.add3(other: Int): Int {
    return this + other
}