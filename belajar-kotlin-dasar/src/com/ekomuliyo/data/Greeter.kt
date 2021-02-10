package com.ekomuliyo.data

class Greeter(val greeting: String){
    operator fun invoke() = println("$greeting")
    operator fun invoke(target: String) = println("$greeting dan $target")
}