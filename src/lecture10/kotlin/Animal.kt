package lecture10.kotlin

abstract class Animal(
    protected val species: String,
    protected open val legCount: Int     //프로퍼티를 오버라이드할때는 open을 붙여주어야 한다.
) {
    abstract fun move()
}