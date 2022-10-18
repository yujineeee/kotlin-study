package lecture09.kotlin

import lecture09.java.JavaPerson
import java.lang.IllegalArgumentException

fun main() {
    val person = Person("유진",999)
    println(person.name)
    person.age = 10
    println(person.age)


    val javaPerson = JavaPerson("유진",999)
    println(javaPerson.name)
    javaPerson.age = 10
    println(javaPerson.age)

    val person3 = Person("장유진")
    println(person3.name)
    println(person3.age)

    val student = Student();

    val person4 = Person()
    println(person4.name)
    println(person4.age)


}


//1. 클래스와 프로퍼티

//
//class Person(name: String, age:Int) { // onstructor(name: String, age:Int){ 생략 가능
//
//    //필드만 만들면 자동으로 겟터셋터 만들어줌 신기하군
//    val name = name
//    var age = age
//
//이렇게도 가능 (constructor 생략 가능, 바로 선언 가능)
//class Person(val name: String, var age:Int)


// 2. 생성자와 init

//init 블록, constructor 블록 -> 최종적으로 this를 받아야함
//class Person(val name: String, var age:Int) {
//
//class Person(name: String, var age:Int) {
//    val name: String = name
//        get() = field.toUpperCase() //무한루프를 막기위한 예약어 - 자기 자신 (backing field) - 드문 경우
//
class Person(name: String, var age:Int) {
//
//    val uppercaseName: String
//        get() = this.name.toUpperCase()

    var name = name
        set (value) {
            field = value.toUpperCase() //setter 자체를 지양하기 때문에 custom setter도 잘 안쓴다
        }

    init {
        if (age < 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("초기화 블록")
    }
    constructor(name: String): this(name, 1) {
        println("첫 번째 부생성자")
    }
    constructor(): this("홍길동") {
        println("두 번째 부생성자")
    }

//    fun isAdult(): Boolean {
//        return this.age >= 20
//    }
//

// 3. 커스텀 getter, setter
    val isAdult: Boolean
        get() = this.age >=20
}

class Student

//추가록 컨스트럭터를 만드는 것보다 디폴트 파라미터를 권장한다. -> 사실상 거의 쓸 일이 없

