package com.ekomuliyo.app

fun main() {

    fun faktorialLoop(value: Int): Int {
        var result = 1
        for(i in value downTo 1) {
            result *= i
        }
        return result
    }
    println(faktorialLoop(10))

    fun faktorialRecursive(value: Int): Int {
        return when (value) {
            1 -> 1
            else -> value * faktorialRecursive(value - 1)
        }
    }
    println(faktorialRecursive(10))
}