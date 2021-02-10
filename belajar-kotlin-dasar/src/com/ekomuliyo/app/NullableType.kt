package com.ekomuliyo.app

fun main(){
    // kotlin akan mendeteksi error nilai variabel text ketika compile
    // val text: String = null // compile errror

    // untuk mengatasi nya, dengan menggunakan tanda tanya setelah tipe data
    // ini memungkinkan untuk mendefinisikan variabel yang bisa diisi dengan nilai null
    val text: String? = null

    if(text != null){
        val textLength = text.length
        print(textLength)
    }

    // safe call adalah sebuah metode pemanggilan sebuah nilai,
    // jika isinya null maka proses akan dilewatkan
    val text2: String? = null
    print(text2?.length)
}