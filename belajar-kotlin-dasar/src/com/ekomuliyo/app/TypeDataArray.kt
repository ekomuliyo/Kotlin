package com.ekomuliyo.app

fun main() {

    val names: Array<String> = arrayOf("Eko", "Muliyo")

    // names[0] = null; // error

    println(names)

    // array nullable
    val names2: Array<String?> = arrayOfNulls(10)

    names2[0] = "Eko"
    names2[1] = "Budi"
    names2[2] = "Rudi"
    names2[3] = "Andi"
    println(names2[0])

}