package com.ekomuliyo

fun main(){
    // menggunakan label loop@ di awal untuk mendefinisikan label
    // dan @loop adalah untuk menandai bahwa jika kondisi j > 3 maka break dan label loop@ yang didefinisikan diawal, proses loop tsb jg dihentikan
    loop@ for (i in 1..5){
        println("Outside Loop")

        for (j in 1..5){
            println("Inside Loop")
            if(j > 3) break@loop
        }
    }
}