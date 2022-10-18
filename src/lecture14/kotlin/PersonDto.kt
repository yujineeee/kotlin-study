package lecture14.kotlin

fun main() {
    val dto1 = PersonDto("장유", 10)
    val dto2 = PersonDto("장유", 20)
    val dto3 = PersonDto("장유", 20)
    println(dto1 == dto2)
    println(dto2 == dto3)
    println(dto1)
}
//데이터 클래스 data (자동으로 eqauls, hashCode, toString을 만들어줌
data class PersonDto(
        val name: String,
        val age: Int
)