fun main(){

    // vargarg argument adalah, mengambil parameter fungsi dari beberapa nilai dengan tipe data yang sama 
    val number = sumNumbers(1, 2, 4, 5, 1, 2)
    println(number)

    // contoh penggunaan generic Array<Int>
    val number2 = arrayOf(10, 20, 30)
    println(sets(number2))

    // penggunaan spread operator
    val number3 = intArrayOf(10, 40, 20, 30)
    println(sumNumbers(1, 2, 3, *number3, 3, 4, 10))
}

fun sumNumbers(vararg number: Int): Int{
    return number.sum()
}

fun sets(number: Array<Int>): Int{
    return number.sum()
}