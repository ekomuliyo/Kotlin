package com.ekomuliyo.app

fun main() {

    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return nameTransform
    }

    val lamdaUpper = {value: String -> value.toUpperCase()}
    println(hello("Eko", lamdaUpper))

    println(hello("Eko", { value: String -> value.toLowerCase() }))

    // pastikan parameter lamda nya di akhir parameter dari fungsi tersebut
    val result = hello("Eko") { value: String ->
        value.toLowerCase()
    }
    println(result)
}