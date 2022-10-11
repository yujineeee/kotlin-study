package lecture07.kotlin

import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun main() {
    var filePrinter = FilePrinter()
    filePrinter.readFile()
}
//1. try catch finally
fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt() //기본 타입간의 형변환은 to타입 사용
    } catch (e: NumberFormatException) { //타입이 뒤에 위치
        throw IllegalArgumentException("주어진 ${str}는 숫자가 아닙니다.")
        //new 사용하지 않음 / 포맷팅이 간결
    }
}

//1. try catch finally
fun parseIntOrThrowV2(str: String): Int? {
    return try {
        str.toInt() //기본 타입간의 형변환은 to타입 사용
    } catch (e: NumberFormatException) { //타입이 뒤에 위치
        null
    }
}

//2. Checked Exception/unChecked Exception