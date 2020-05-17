fun main(){
    // contoh sederhana penggunaan generics
    val longArrayList = ArrayList<Long>()
    val firstLong = longArrayList[0]
    println(firstLong)

    // constraint type parameter, membatasi tipe parameter dari sebuah class generic
    val number1 = ListNumber<Long>()
    val number2 = ListNumber<Int>()
    val number3 = ListNumber<Double>()
    // val number4 = ListNumber<String>() // error, karena String buka merupakan tipe data Number

    println(number1)
    println(number2)
    println(number3)
}

class ArrayList<T> : List<T>{
    override fun get(index: Int) : T {
        return this[index]
    }
}

class ListNumber<T: Number> : List<T>{
    override fun get(index: Int) : T{
        return this[index]
    }
}

interface List<P> {
    operator fun get(index: Int) : P
}

