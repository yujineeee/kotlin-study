package lecture02.kotlin

import lecture01.Person

fun main() {
    //safe-call
    var str: String? = "ABC"
    //println(str.length) //null이 들어갈 수 있는 변수는 호출할수 없음
    println(str?.length) //safe-call
    
    //elvis 연산자
    var elvisStr: String? = null
    println(elvisStr?.length ?: 0) //null이면 0으로 출

    //널아님 단언
    println(startsWith("A"))

    //플랫폼 타입 - null 정보를 알수없으면 런타임 에러가 날 수 있음
    val person = Person("장유진")
    startsWithA(person.name)
}


fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null 들어옴")
    /*
    //before
    if (str == null) {
        throw IllegalArgumentException("null 들어옴")
    }
    return str.startsWith("A")
    */
}

fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
//    if (str == null) {
//        return null
//    }
//    return str.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
//    if (str == null) {
//        return false
//    }
//    return str.startsWith("A")
}

//null 아님 단언
fun startsWith(str: String?): Boolean {
    return str!!.startsWith("A")
}

fun startsWithA(str: String): Boolean {
    return str.startsWith("A")
}