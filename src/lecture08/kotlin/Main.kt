package lecture08.kotlin

fun main() {
    repeat("메롱1")
    repeat("메롱2", 2)
    repeat("메롱3", 4, false)

    //3. named argument
    repeat("매개변수이름직접지정", useNewLine = false)
    printNameAndGender(gender = "여성", name = "유진")

    //4. 가변인자
    printAll("A1", "B1", "C1")
    val array = arrayOf("A2", "B2", "C2")
    printAll(*array)
}

// 1. 함수 선언 문법
fun max(a: Int, b: Int) = if (a > b) a else b

// 2. default parameter
fun repeat(
        str: String,
        num: Int = 3,
        useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

//3. named argument 장점
fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

//4. 가변인자 //vararg
fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}



