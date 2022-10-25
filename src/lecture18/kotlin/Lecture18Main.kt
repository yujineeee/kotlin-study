package lecture18.kotlin

import lecture17.kotlin.Fruit


fun main() {
    val fruits = listOf(
            Fruit("사과", 1000),
            Fruit("사과", 3000),
            Fruit("바나나", 3000),
            Fruit("사과", 1000),
            Fruit("수박", 1500)
    )

    // 1. 필터와 맵
    val apples = fruits.filter {fruit -> fruit.name == "사과"}
    val applesWithIndex = fruits.filterIndexed {idx, fruit ->
        println(idx)
        fruit.name == "사과"
    }
    val applePrices = fruits.filter { fruit -> fruit.name == "사과" }
            .map { fruit -> fruit.price }

    val applePricesWithIndex = fruits.filter { fruit -> fruit.name == "사과" }
            .mapIndexed { idx, fruit ->
                println(idx)
                fruit.price
            }

    val fruitsNotNull = fruits.filter { fruit -> fruit.name == "사과" }
            .mapNotNull {fruit -> fruit.nullOrValue()}

    // 2. 다양한 컬렉션 처리 기능
    val isAllApple = fruits.all { fruit -> fruit.name == "사과" }
    val isNoApple = fruits.none { fruit -> fruit.name == "사과" }
    val isAnyApple = fruits.any { fruit -> fruit.name == "사과" }

    val fruitCount = fruits.count()
    val fruitSort = fruits.sortedBy { fruit -> fruit.price }
    val fruitSortDesc = fruits.sortedByDescending { fruit -> fruit.price }
    val distinctFruit = fruits.distinctBy { fruit -> fruit.name }
            .map { fruit -> fruit.name }
    val firstFruit = fruits.first()
    val firstOrNullFruit = fruits.firstOrNull() //첫번쨰 값 또는 null을 가져온다


    // 3. List를 MAp으로
    val map: Map<String, List<Fruit>> = fruits.groupBy {fruit -> fruit.name}
    val priceMap: Map<String, List<Int>> = fruits.groupBy({fruit -> fruit.name}, {fruit -> fruit.price})
    //map에서도 앞선 기능들을 사용 가능
    val filteredAppleMap: Map<String, List<Fruit>> = fruits.groupBy {fruit -> fruit.name}
            .filter { (key, value) -> key == "사과" }

    // 4. 중첩된 컬렉션 처리
    val fruitsInList: List<List<Fruit>> = listOf(
            listOf(
                    Fruit("사과", 1000),
                    Fruit("사과", 3000)
            ),
            listOf(
                    Fruit("바나나", 3000),
                    Fruit("사과", 1000)
            ),
            listOf(
                    Fruit("사과", 1000),
                    Fruit("수박", 1500)
            )
    )

     val apple1dollar = fruitsInList.flatMap { list ->
         list.filter {fruit -> fruit.price == 1000 && fruit.name == "사과"}
     }

    val flattenList = fruitsInList.flatten() //오..
}


private fun filterFruits(
        fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
   return fruits.filter(filter)
}