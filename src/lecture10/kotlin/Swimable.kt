package lecture10.kotlin

//인터페이
interface Swimable {

    val swimAbility: Int
        get() = 3

    fun act() {
        println("어푸 어푸")
    }
}