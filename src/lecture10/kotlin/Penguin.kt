package lecture10.kotlin

class Penguin(
        species: String
) : Animal(species, 2), Swimable, Flyable { //인터페이스도 :
    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 움직입니다~ 꿱")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() { //super<함수타입>.메소드
        super<Swimable>.act()
        super<Flyable>.act()
    }

}