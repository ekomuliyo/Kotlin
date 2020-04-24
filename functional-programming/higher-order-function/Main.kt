fun main(){
    // higher-order function, sebuh fungsi yang menggunakan fungsi lain sebagai parameter

    // contoh sederhana
    printResult(10, sum)

    // contoh melampirkan body lamda expression secara langsung
    printResult2(20){ value ->
        value + value
    }

}

fun printResult(value: Int, sum: (Int) -> Int){
    val result = sum(value)
    println(result)
}

var sum: (Int) -> Int = { value -> value + value}

fun printResult2(value: Int, sum: (Int) -> Int){
    val result = sum(value)
    println(result)
}