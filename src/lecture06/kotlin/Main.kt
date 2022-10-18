package lecture06.kotlin


fun main() {
    //1. for each 문
    val numbers = listOf(1L, 2L, 3L); //컬렉션을 만드는 방법
    for (number in numbers) { // : 대신 in을 사용
       println(number);
    }

    //2. 전통적인 for문
    for (i in 1..3) {
        println(i)
    }

    //3-1. progression-range > 전통적인 for문 - 내려가는 경우
    for (i in 3 downTo 1) {
        println(i)
    }

    //3-2. progression-range > 전통적인 for문 - 2칸씩 올라가는 경우
    for (i in 1..5 step 2) {
        println(i)
    }

    //4. while 문 - 자바와 동일
    var i = 1
    while (i <= 3) {
        println(i)
        i++
    }

}
