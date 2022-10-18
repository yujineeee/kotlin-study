package lecture10.kotlin

interface Flyable {

    fun act() { //디폴트 키워드 없이 구현 가능
        println("파다규파닥")
    }

    //추상 메소드
    //fun fly()
}