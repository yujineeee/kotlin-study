package lecture10.kotlin

class Cat(
        species: String
) : Animal(species, 4) { //extends 대신 :, 상위 클래스의 생성자를 바로 호출

    //오버라이드를 필수적으로 붙여주어야함
    override fun move() {
        println("코틀린 고양이 사뿐사뿐")
    }
}