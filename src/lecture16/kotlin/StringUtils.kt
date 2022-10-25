package lecture16.kotlin

import lecture16.Person

fun main() {
    /*
    * 1. 확장 함수
    * */
    val str = "ABC"
    println(str.lastChar())

}


/*
* 1. 확장 함수
* */
fun String.lastChar(): Char {

    //fun 확장하려는클래스.함수이름(파라미터): 리턴타입
    //protected, private은 가지고 올 수 없음
    return this[this.length - 1]
}
