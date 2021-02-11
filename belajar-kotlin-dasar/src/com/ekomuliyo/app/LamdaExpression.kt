package com.ekomuliyo.app

fun toUpper(value: String): String = value.toUpperCase()

fun main() {

    val contohLamda: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "$firstName, $lastName"
        result
    }

    val result = contohLamda("Eko", "Muliyo")
    println(result)

    // it adalah paramater pertama, dan parameter dari lamda tidak boleh lebih dari 1
    val sayHello: (String) -> String = {
        "Hello $it"
    }
    println(sayHello("Eko"))

    // method references
    val toUpperCase: (String) -> String = ::toUpper
    println(toUpperCase("Budi"))

    // lamda tanpa parameter
    val run: () -> Unit = {
        println("Running...")
    }

    run()
}