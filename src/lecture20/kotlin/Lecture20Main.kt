package lecture20.kotlin

import lecture20.Person


fun main() {
    val person = Person("유진", 111)


    //2. 스코프 펑션의 분류
    //age
    val value1 = person.let {
        it.age
    }

    //age
    val value2 = person.run {
        this.age
    }

    //person
    val value3 = person.also {
        it.age
    }

    //person
    val value4 = person.apply {
        this.age
    }

    //실행결과
    println("let $value1")
    println("run $value2")
    println("also $value3")
    println("apply $value4")
    /*
    * let 111
    * run 111
    * also lecture16.Person@63947c6b
    * apply lecture16.Person@63947c6b
    * */

    //3-1. 언제 스코프 펑션을 사용하나? let1
    val strings = listOf("APPLE", "CAR")
    strings.map {it.length}
            .filter {it > 3}
            .let(::println)

    //3-3. 언제스코프펑션을 사용하나? let - 일회성으로 제한된 영역에 지역 변수를 만들때
    val numbers = listOf("one", "two", "three", "four")
    val modifiedFirstItem = numbers.first()
            .let { firstItem ->
                if (firstItem.length >= 5) firstItem else "!$firstItem!"
            }.toUpperCase()
    println(modifiedFirstItem)
    //주로 쓰지 않음


    //3-4. run - 객체를 만들어 DB에 바로 저장하고, 그 인스턴스를 활용할 때
    //val person = Person("장유진",55).run(personRepository::save)
    //별로 추천하지는 않음

    /*
    val person = Person("장유진",66).run {
        hobby = "독서"
        personRepository.save(this)
    }}*/

    //생성자가 너무 길어지는 경우, 사용하시는 편


    //also
    mutableListOf("one", "two", "three")
            .also{println("리스트 엘리먼츠 비포어 애딩 뉴원: $it")}
            .add("four")

    ///위랑 똑같음
    val numbers2 = mutableListOf("one", "two", "three")
    println("리스트 엘리먼츠 비포어 애딩 뉴원: $numbers2")
    numbers2.add("four")


    //with



// 리팩토링 전
fun printPerson(person: Person?) {

    if (person != null) {
        println(person.name)
        println(person.age)
    }
}

// 리팩토링 후
fun printPersonRefactored(person: Person?) {
    person?.let {//safe-call 사용
        println(it.name)
        println(it.age)
    }
}

//3. 언제 스코프 펑션을 사용하나? (non-null에 대해서만 코드블록을 실행시킬때)
fun useLetForNonNull(str: String?) {
    val length = str?.let{
        println(it.toUpperCase())
        it.length
    }
    println(length)
}

}

//3-5. apply
/*
fun createPerson(
        name: String,
        age: Int,
        hobby: String
): Person {
    return Person(
            name = name,
            age = age
    ).apply {
        this.hobby = hobby
    }
}
}
*/