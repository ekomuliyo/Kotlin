fun main(){
    // function type, untuk mendeklarasikan sebuah tipe parameter dan kembalian nilai dari sebuah fungsi

    val sumResult = sum2(10, 10)
    val multiplyResult = multiply(20, 30)

    println(sumResult)
    println(multiplyResult)

    // nullable
    val sumResult2 = sum3?.invoke(100, 200)
    println(sumResult2)
}

typealias Arithmetic = (Int, Int) -> Int

val sum2: Arithmetic = { valueA, valueB -> valueA + valueB}

val multiply: Arithmetic = { valueA, valueB -> valueA * valueB}


typealias Arithmetic2 = ((Int, Int) -> Int)?
val sum3: Arithmetic2 = { valueA, valueB -> valueA + valueB}