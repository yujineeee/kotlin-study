package lecture05.kotlin

//1-1. if 문
fun validateScoreIsNotNegative(score: Int) {

    if (score < 0) {
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
    }

}

//2-1. statement-expression > if-else 문
fun getPassOrFail(score: Int): String {
    /*
    if (score >= 50) {
        return "P"
    } else {
        return "F"
    }
     */

    //3항 연산자가 없다
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

//2-2. statement-expression > if-else if-else 문
fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else {
        "D"
    }
}

//2-3. statement-expression > 범위 (간단 팁)
fun validateScoreIsNotNegativeRange(score: Int) {
    if (score !in 0..100) {
        throw IllegalArgumentException("${score}범위는 0부터 100 입니다.")
    }
//    if (score in 0..100) {
//
//    }
}

//3. switch-when
fun getGradeWithSwitch(score: Int): String {
    /*
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
    */

    //오..
    return when (score) {
        in 90..99-> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }

}

//3. switch-when
fun startsWithA(obj: Any): Boolean {
    return when(obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

//3. switch-when - 여러개의 조건 동시 적용 가능
fun judgeNumber(number: Int) {
    return when(number) {
        1, 0, -1 -> println("어디서 많이 본 숫자입니다.")
        else -> println("어디서 많이 본 숫자가 아닙니다.")
    }
}

//3. switch-when - 조건 자체가 없는 경우
fun judgeNumber2(number: Int) {
    return when {
        number == 0 -> println("주어진 숫자는 0입니다.")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다.")
        else -> println("주어진 숫자는 홀수입니다.")
    }
}
