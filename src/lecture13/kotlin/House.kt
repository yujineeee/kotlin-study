package lecture13.kotlin

fun main() {

}

class JavaHouse(
        private val address: String,
        private val livingRoom: LivingRoom
) {
    inner class LivingRoom(
            private val area: Double
    ) {
        val address: String
            get() = this@JavaHouse.address
        //바깥 클래스를 굳이 참조하려면 inner class
    }
}
