package com.ekomuliyo.app

fun main() {

    tailrec fun display(value: Int) {
        println("Recursive $value")
        if(value > 0) {
            display(value - 1)
        }
    }

    // display(10000)

    tailrec fun faktorialRecursive(value: Int, total:Long = 1L): Long {
        return when (value) {
            1 -> total
            else -> faktorialRecursive(value - 1, total * value)
        }
    }
    println(faktorialRecursive(5))

}