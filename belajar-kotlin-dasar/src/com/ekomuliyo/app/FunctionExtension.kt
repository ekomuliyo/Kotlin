package com.ekomuliyo.app

fun String.hello(): String {
    return "Hello ${this}"
}

fun main() {

    val name: String = "Eko"
    val hello: String = name.hello()
    println(hello)
}