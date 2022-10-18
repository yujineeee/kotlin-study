package lecture12.kotlin

fun main() {

    println(Singleton.a)
    Singleton .a = 10
    println(Singleton.a)

}

class Person private constructor(
        var name: String,
        var age: Int
) {

    //코틀린은 static이 없다.
    companion object Factory : Log {
        private const val MIN_AGE = 0 //const <- 컴파일 시에 변수 할당 (안쓰면 런타임 시에 변수 할당)

        @JvmStatic
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("나는 펄슨의 동행 객체에요..")
        }
    }

}


object Singleton {
    var a: Int = 0
}