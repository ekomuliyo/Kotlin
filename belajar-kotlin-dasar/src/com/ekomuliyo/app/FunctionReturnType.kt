package com.ekomuliyo.app

fun jumlahkan(a: Int, b: Int): Int {
    val jumlah = a + b;
    return jumlah
}

fun bagi(a: Int, b: Int): Int {
    if(b == 0) {
        return 0
    } else {
        val jumlah = a / b
        return jumlah
    }
}

fun main() {
    println(jumlahkan(10, 20))
    println(bagi(100, 20))
}