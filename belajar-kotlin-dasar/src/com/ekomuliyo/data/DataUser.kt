package com.ekomuliyo.data

data class DataUser(val name: String, val age: Int){
    fun intro(){
        println("My Name is $name, and i am $age years old")
    }
}