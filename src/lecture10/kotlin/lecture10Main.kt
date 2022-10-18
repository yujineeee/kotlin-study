package lecture10.kotlin

//3. 클래스를 상속받을 떄 주의할 점
// - 상위 클래스를 설계할 때 생성자 /초기화 블록에 사용되는 프로퍼티에는 open을 피해야한다
fun main() {
    Derived(300)
}

open class Base(
        open val number: Int = 100
) {
    init {
        println("Base Class")
        println(number)
    }
}

class Derived(
        override val number: Int
) : Base(number) {
    init {
        println("Derived Class")
    }
}

//4. 상속 관련 키워드 4가지 정리
//1. final: override 할 수 없게한다. defulat로 보이지 않게 존재한다
//2, open: override를 열어준다
//3. abstract: 반드시 override 해야한다.
//4. override: 사우이 타입을 오버라이드 하고 있다.

