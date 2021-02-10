package com.ekomuliyo.app

fun main() {

    fun sayHello(name: String = ""): String {
        return if(name == "") {
            "Hello Bro!"
        }else {
            "Hello ${name}"
        }
    }

    fun sayHello2(name: String = ""): String {
        return when(name) {
            "" -> "Hello bro!"
            else -> "Hello ${name}"
        }
    }

    println(sayHello())
    println(sayHello("Eko"))

    println(sayHello2(""))
    println(sayHello2("Eko"))

}