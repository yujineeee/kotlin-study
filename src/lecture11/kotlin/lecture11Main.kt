package lecture11.kotlin

//public 이 생략되어 있음
val a = 3

fun add(a: Int, b: Int): Int {
    return a + b
}

class Cat private constructor( //public 외 다른 접근 지시어를 사용하려면 선언 해주어야함

)

class Car(
        internal val name: String, //Java에서는 퍼블릭이 된다. 
        private var owner: String,
        _price: Int
) {
    var price = _price
        private set
}