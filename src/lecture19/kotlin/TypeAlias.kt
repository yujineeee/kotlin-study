package lecture19.kotlin

import lecture17.kotlin.Fruit

typealias FruitFilter = (Fruit) -> Boolean
/*
fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean) {

}
*/
fun filterFruits(fruits: List<Fruit>, filter: FruitFilter) {
    println(fruits.filter(filter).size)
}