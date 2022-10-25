package lecture17.kotlin

fun main() {
    val fruits = listOf(
            Fruit("사과", 1000),
            Fruit("사과", 3000),
            Fruit("바나나", 3000),
            Fruit("사과", 1000),
            Fruit("수박", 1500)
    )

    //람다를 만드는 법 1
    val isApple = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    val isApple_type: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    //람다를 만드는 법 2
    val isApple2 = { fruit: Fruit -> fruit.name == "사과" }
    val isApple2_type: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과" }

    //람다를 호출하는 방법1
    isApple(fruits[0])
    //람다를 호출하는 방법2
    isApple.invoke(fruits[0])

    filterFruits(fruits, isApple)
    filterFruits(fruits){ it.name == "사과" }
}


private fun filterFruits(
   fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }
    return results
}