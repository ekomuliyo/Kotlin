fun main(){
    // extension memungkinkan kita menambah fungsi atau properti dari suatu class, tanpa harus mewarisi class tsb
    
    // contoh penerapan pada function
    10.printInt()
    println()
    println(20.plusThree())

    // contoh penerapan pada properti / variabel
    print(10.slice)


    /* Nullable Receiver 
       memungkinan kita mendeklarasikan extension dengan nullable receiver type  
    */
    println()
    val value: Int? = null
    println(value.slice2)

    // penggunaan safe call operator
    val value2: Int? = null
    println(value2?.slice3)
}

fun Int.printInt(){
    print("value $this") // variabel this adalah konteks dari class tsbt
}

fun Int.plusThree(): Int{
    return this + 3
}

val Int.slice: Int 
    get() = this / 2

val Int?.slice2: Int
    get() = this?.div(2) ?: 0

val Int.slice3: Int
    get() = this.div(2)