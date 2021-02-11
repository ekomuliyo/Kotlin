package com.ekomuliyo.app

fun main() {

    var counter: Int = 0

    val lamdaIncrement: () -> Unit = {
        println("lamda increment")
        counter++
    }

    val anonymousIncrement = fun() {
        println("anonymous increment")
        counter++
    }

    fun functionIncrement() {
        println("function increment")
        counter++
    }

    lamdaIncrement()
    anonymousIncrement()
    functionIncrement()

    println(counter)

}