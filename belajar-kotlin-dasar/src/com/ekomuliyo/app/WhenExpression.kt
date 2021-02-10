package com.ekomuliyo.app

fun main(){
    // penggunaan sederhana when
    // when wajib menggunakan else
    val value = 3
    val stringOfValue = when(value){
        1 -> "value is 1"
        2 -> "value is 2"
        3 -> {
            print("print value 3, lebih dari satu baris")
            "value is 3"
        }
        else -> "undefimed"
    }

    print(stringOfValue)

    println()
    // penggunaan is !is, memeriksa apakah object merupakan instance dari object tsb
    val anyType: Any = 100L
    when(anyType){
        is Long -> print("tipe data Long")
        is String -> print("tipe data String")
        else -> print("undefined")
    }

    println()
    // penggunaan range, mengecek sebuah nilai apakah dalam sebuah range atau tidak
    val value2 = 26
    val ranges = 10..55
    when(value2){
        in ranges -> print("value is in the range")
        !in ranges -> print("value is not in the range")
        else -> print("undefined")
    }

    println()
    // menangkap subject dari when, atau mengambil value dari method yang menjadi argument when
    val registerNumber = when(val regis = getRegisterNumber()){
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }

    print(registerNumber)

}
fun getRegisterNumber() = (1..100).random()


