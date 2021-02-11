package com.ekomuliyo.app

infix fun String.to(type: String): Pair<Any, Any> {
    if(type == "UP") {
        return this.toUpperCase()
    } else {
        return this.toLowerCase()
    }
}

fun main() {

    val result = "Eko" to "UP"
    println(result)

}