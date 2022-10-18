package lecture14.kotlin

fun handleCountry(country: Country) {
    when (country) {
        Country.KOREA -> println("대한민국")
        Country.AMERICA -> println("어메리카")
    }
    //else를 안써도 되고, Enum에 변화가 있으면 알 수 있다.
}

enum class Country(
        private val code: String
) {
    KOREA("KO"),
    AMERICA("US"),
    A("A")
    ;


}