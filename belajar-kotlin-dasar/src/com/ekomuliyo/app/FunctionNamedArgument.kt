package com.ekomuliyo.app

fun main() {

    fullName(firstName = "Eko", lastName = "Saputra", middleName = "Muliyo")

}

fun fullName(firstName: String, middleName: String, lastName: String) {
    println("firstname =  ${firstName}, middlename = ${middleName}, lastname = ${lastName}")
}