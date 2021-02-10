package com.ekomuliyo.app

fun main(){
    // range sederhana
    val rangeInt = 1..10 step 2
    rangeInt.forEach {
        print("$it ") // variabel $it adalah variabel yang otomatis dibuat dari setiap nilai yang di iterasi / foreach
    }

    println()
    // downTo
    val downInt = 10.downTo(1);

    downInt.forEach{
        print("$it ")
    }

    println()
    // menggunakan in di variabel downInt
    // memeriksa apakah value tersebut terdapat pada element yang ingin dicari
    if(7 in downInt){
        println("Value 7 is Available")
    }

    // menggunakan !in
    // memeriksa apakah value tersebut tidak ada pada element yang ingin dicari
    if(11 !in downInt){
        println("value 11 is not available")
    }

    // Range juga terdapat banyak di tipe data lain
    // Int, Long, Char
}