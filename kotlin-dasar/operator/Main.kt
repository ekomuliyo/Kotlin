fun main(args: Array<String>){

    // Arithmetic Operator
    val number1 = 12.5
    val number2 = 3.5
    var result: Double

    result = number1 + number2
    println("number1 + number2 = $result")

    result = number1 - number2
    println("number1 - number2 = $result")

    result = number1 * number2
    println("number1 * number2 = $result")

    result = number1 / number2
    println("number1 / number2 = $result")

    result = number1 % number2
    println("number1 % number2 = $result")

    // Concatenation of Strings
    val start = "Talk is cheap. "
    val middle = "Show me the code. "
    val end = "- Linus Torvalds"

    val result2 = start + middle + end
    println(result2)


    // Comparison and Equality Operators

    val a = -12
    val b = 12

    val max = if(a > b){
        println("a is larger than b.")
        a
    }else{
        println("b is larger than a")
        b
    }
    println("max = $max")

    // Operator in, mengecek sebuah object di dalam sebuah koleksi / array
    val numbers = intArrayOf(1, 2, 42, -3, 4)

    if(4 in numbers){
        println("numbers array conaint 4")
    }else{
        println("angka tidak tidak ditemukan")
    }

    // mengakses index
    println(numbers[1])

    // invoke operator
    // contoh 1, memanggil class sebagai fungsi yang bisa overloading
    val hello = Greeter("Hello")
    hello()

    // contoh 2, memanggil variabel ekspresi lamda
    myPrintHello.invoke()
    mySayHello.invoke("Eko")
    msgDisplay.invoke("Eko", 23)



}

class Greeter(val greeting: String){
    operator fun invoke() = println("$greeting")
    operator fun invoke(target: String) = println("$greeting dan $target")
}

val myPrintHello = {
    println("Hello World....")
}

val mySayHello = { name: String ->
    println("Hello $name")
}

val msgDisplay = { name: String, age: Int ->
    println("Hai $name, and my age $age")
}