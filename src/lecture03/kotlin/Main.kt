package lecture03.kotlin

import lecture01.Person

fun main() {

    //기본 타입

    /*
    val number1 = 3 //Int
    val number2 = 3L //Long
    val number3 = 3.0f //float
    var number4 = 3.0 //double  //타입간의 변화는 명시적으로 이뤄저야함
    */

    val number1 = 3
    val number2: Long = number1.toLong() //그냥 number1하면 컴파일 오류 (type mismatch)
    println(number1 + number2)

    val nullableNumber1: Int? = 3
    val nullbaleNumber2: Long = number1?.toLong() ?: 0L // 널러블은 적절한 처리가 필요

    val person = Person("장유진")
    println("이름 : ${person.name}")
    val name = "장유진"
    println("이름 : $name")


    val sentence = """
        오호 여기에 자유롭게
        문자열을 쓰면 되는군요
        하하 ${name}
    """.trimIndent()
    println(sentence)

    val abc = "ABC"
    println(abc[0])
    println(abc[2])
}

fun printNameIfPerson(obj: Any) {
    if (obj is Person) {
        //val person = obj as Person
        //println(person.name)
        println(obj.name)
    }
    if (obj !is Person) {
        println("Person이 아닌 경우 !is로 체크")
    }
}


fun printNameIfNullablePerson(obj: Any?) {
    val person = obj as? Person
     println(person?.name)
}