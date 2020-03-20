fun main(){

    // Byte range (-128, 127)
    val range: Byte = 112
    println("$range")

    // Short range (-32768, 32767)
    val temperature: Short = -11245
    println("$temperature")

    // Int range (-2,147,483,648, 2,147,483,647)
    val score: Int = 10000
    println("$score")

    // Long range (-9,223,372,036,854,775,808, 9,223,372,036,854,775,807)
    val highScore: Long = 1000000000
    println("$highScore")

    // Double
    val distance = 999.5
    println("$distance")

    // Float 
    val distanceFloat = 19.5F
    println("$distanceFloat")

    // Number 
    // otomatis memberikan type data dari sebuah angka, ini istilahnya kotlin smart cast
    var test: Number = 12.1
    println("$test")

    test = 11
    println("$test")

    test = 10L
    println("$test")

    // Char, harus memakai petik satu
    val letter : Char
    letter = 'A'
    println("$letter")

    // Boolean
    val flag = true
    println("$flag")
}