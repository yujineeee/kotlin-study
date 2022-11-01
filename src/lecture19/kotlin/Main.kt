package lecture19.kotlin

// as import : 임포트와 동시에 이름을 변경
import lecture14.kotlin.PersonDto
import lecture19.kotlin.a.printHelloWorld as HelloA
import lecture19.kotlin.b.printHelloWorld as HelloB

data class Person(
    val name: String,
    val age: Int
)

class Person2(
        val name: String,
        val age: Int
) {
    operator fun component1(): String {
        return this.name
    }
    operator fun component2(): Int {
        return this.age
    }
}

fun main() {
    HelloA()
    HelloB()

    //2. 구조 분해
    val person = Person("유진", 999)
    val (name, age) = person

    println("이름 : ${name}, 나이: ${age}")
    //componentN 을 자동으로 만들어줌
    //val name = person.component1()
    //val age = person.component2()
    //이것과 같음 -> 근데 이걸 쓸 일이 많을까요? 좋은건가?

    //직접 componenteN을 구현도 가능
    val person2 = Person2("유진22", 123)
    val (name2, age2) = person2
    println("이름 : ${name2}, 나이: ${age2}")



    //3. Jump와 Label
    val numbers = listOf(1,2,3)
    numbers.map { number -> number + 1 }
            .forEach{number -> println(number)}

    numbers.forEach{number ->
        if (number == 2) {
            //break; continue 동작하지 않음
            //foreach에서는 break continue를 쓸 수 없어 아래같이 써줘야함
            //  return@run

        }
    }

    run {
        numbers.forEach {number ->
            if (number == 2) {
                return@run
            }
        }
    }

    //음...
    numbers.forEach {number ->
        if (number == 2) {
            return@forEach
        }
    }

    //break, continue 사용 시 가급적 익숙한 for문 사용 추천

    abc@ for (i in 1..100) {
        for (j in 1..100) {
            if (j == 2) {
                break@abc
            }
            println("${i} ${j}")
        }
    }

    //4. TakeIf와 TakeUnless

}

fun getNumberOrNull(number:Int): Int? {
    return if(number <= 0) {
        null
    } else {
        number
    }
}

fun getNumberOrNullV2(number:Int): Int? {
    return number.takeIf {it > 0}
}

fun getNumberOrNullV3(number:Int): Int? {
    return number.takeUnless {it <= 0}
}