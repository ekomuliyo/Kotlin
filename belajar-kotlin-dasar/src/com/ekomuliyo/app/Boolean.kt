package com.ekomuliyo

fun main(){
    // Conjunction atau AND
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isOpen = now >= officeOpen && now <= officeClosed

    println("Office is open : $isOpen")

    // Disjunction atau OR
    val officeOpen2 = 7
    val officeClosed2 = 16
    val now2 = 20

    val isOpen2 = now2 < officeOpen2 || now > officeClosed2

    println("Office is closed : $isOpen2")

    // Negation atau Not
    val officeOpen3 = 7
    val now3 = 10
    val isOpen3 = now3 > officeOpen3

    if(!isOpen3){
        println("Office is closed")
    }else{
        print("Office is open")
    }
}