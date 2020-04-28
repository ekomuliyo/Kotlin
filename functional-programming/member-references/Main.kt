fun main() {
    // mereferensikan sebuah fungsi dari function type, extension function

    // function type
    val numbers = 1.rangeTo(10)
    val evenNumbers = numbers.filter(::isEvenNumber)

    println(evenNumbers)

    // extension function
    val numbers2 = 1.rangeTo(20)
    val evenNumbers2 = numbers2.filter(Int::isEvenNumber2)
    
    println(evenNumbers2)

    // Operator :: dapat juga digunakan untuk mereferensikan sebuah property, fungsi setter, getter
    println(::message.name) // menampilkan nama variabel
    println(::message.get()) // menampilkan value variabel

    ::message.set("Kotlin Academy") // mengeset atau mengubah nilai dari variabel message

    println(::message.get()) // menampilkan "Kotlin Academy"

}

var message = "Kotlin"

fun isEvenNumber(number: Int) = number % 2 == 0

fun Int.isEvenNumber2() = this % 2 == 0