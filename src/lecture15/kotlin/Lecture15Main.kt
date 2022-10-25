package lecture15.kotlin

fun main() {

    val array = arrayOf(100, 200)

    /*
    * 1. 코틀린에서의 배열
    * */
    // 인덱스 사용
    for (i in array.indices) {
        println("${i} ${array[i]}")
    }

    //with 인덱스
    for ((idx, value) in array.withIndex()) {
        println("$idx $value")
    }

    //엘리먼트 추가
    array.plus(300)

    /*
   * 2. 코틀린에서의 collection
   * */

    val numbers = listOf(100, 200)
    val emptyList = emptyList<Int>() //타입을 적어줘야 함
    printNumbers(emptyList()) // 추론 가능하여 타입 안적어도 됨

    println(numbers[0])

    for (number in numbers) {
        println(number)
    }

    for ((index, number) in numbers.withIndex()) {
        println("$index $number")
    }

    //가변 리스트
    val mutableNumbers = mutableListOf(100, 200)
    mutableNumbers.plus(300)

    //TIP: 불변을 만들고 가변으로 바꾸자!

    /*
   * 2. 코틀린에서의 collection - set
   * */
    val setNumbers = setOf(100, 200)

    for (number in setNumbers) {
        println(number)
    }

    for ((index, number) in setNumbers.withIndex()) {
        println("$index $number")
    }

    //가변 집합을 만들고 싶다면? (LinkedHashSet)
    mutableSetOf(100L)

    /*
      * 2. 코틀린에서의 collection - map
      * */

    val oldMap = mutableMapOf<Int, String>()
    oldMap.put(1, "MONDAY")
    oldMap[2] = "TUESDAY"

    mapOf(1 to "MONDAY", 2 to "TUESDAY") //불변맵

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for ((key, value) in oldMap.entries) {
        println(key)
        println(value)
    }

    /*
     * 3. 콜렉션의 null 가능성
     * */
    // 같이 섞어쓸떄 문제가 될 수 있음
    // 자바코드를 보면서 가져오는 지점을 wrapping해서 영향 범위를 최소화해야한다.
}

private fun printNumbers(numbers: List<Int>) {
    println(numbers)
}