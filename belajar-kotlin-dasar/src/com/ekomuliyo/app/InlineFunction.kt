package com.ekomuliyo.app

inline fun hello(name: () -> String): String{
    return "hello ${name()}"
}

inline fun hello2(firsName: () -> String, lastName: () -> String): String{
    return "hello ${firsName()} ${lastName()}"
}

fun main() {

    for (i in 1..100) {
        println(hello2({ "Eko" }, { "Muliyo" }))
    }

}