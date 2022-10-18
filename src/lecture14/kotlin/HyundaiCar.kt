package lecture14.kotlin

fun main() {
    handleCar(Avante())
}

private fun handleCar(car: HyundaiCar) {
    when (car) {
        is Avante -> println("아반떼입니다. ${car.name}, ${car.price}")
        is Sonata -> println("${car.name}, ${car.price}")
        is Grandeur -> println("${car.name}, ${car.price}")
    }
}

sealed class HyundaiCar(
        val name: String,
        val price: Long
)

class Avante : HyundaiCar("아반떼", 1_000L)

class Sonata : HyundaiCar("소나타", 2_000L)

class Grandeur : HyundaiCar("그렌저", 3_000L)
