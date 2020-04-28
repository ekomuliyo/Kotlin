fun main(){
    // inner function, memungkinan mengakses property dari terluar fungsinya

    // contoh 1
    setWord("hello")

    // contoh 2
    println(sum(1, 2, 3))

    // contoh 3
    println(sum2(3, 4, 5))
}

fun setWord(message: String){
    fun printMessage(){
        println(message)
    }

    printMessage()
}

// penggunaan function type
fun sum(valueA: Int, valueB: Int, valueC: Int): Int{

    fun validateNumber(value: Int){
        if(value == 0){
            throw IllegalArgumentException("value must be better than 0")
        }
    }

    validateNumber(valueA)
    validateNumber(valueB)
    validateNumber(valueC)

    return valueA + valueB + valueC
}

// penggunaan extension function
fun sum2(valueA: Int, valueB: Int, valueC: Int): Int{
    fun Int.validateNumber(){
        if(this == 0){
            throw IllegalArgumentException("value must be better than 0")
        }
    }

    valueA.validateNumber()
    valueB.validateNumber()
    valueC.validateNumber()

    return valueA + valueB + valueC
}