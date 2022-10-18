package lecture12.kotlin

import lecture12.java.Movable

fun main() {
    moveSomething(object : Movable {
        override fun move() {
            println("움직")
        }

        override fun fly() {
            println("날날")
        }

    })
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}