fun main(){

    // List
    // List secara default bersifat immutable atau isinya tidak dapat diubah
    // list sederhana dengan tipe Integer
    // cara explisit
    val numberList: List<Int> = listOf(1, 2, 3, 4, 5)
    println(numberList)

    // cara implisit
    val charList = listOf('A', 'B', 'C')
    println(charList)

    // list dengan tipe data yang berbeda
    val anyList = listOf(1, "Hai", 3, true)

    println(anyList[0])

    // membuat list jadi mutable atau isinya dapat diubah
    val anyList2 = mutableListOf('A', "hello", true)
    anyList2.add('B')
    anyList2[2] = false
    println(anyList2)

    println()
    // Sets 
    // Sets adalah sebuah collection yang memungkinkan kita dapat menyimpan data dengan unik, atau tidak ada yang sama

    val integerSet = setOf(1, 2, 3, 5, 1) // nilai satu akan dihilangkan dari list
    println(integerSet)

    // set juga tidak peduli urutan suatu element nya, seperti contoh berikut
    val setA = setOf(1, 2, 3, 4, 5, 7, 6)
    val setB = setOf(2, 3, 2, 1, 6, 4)
    println(setA == setB)

    // penggunaan in dengan setOf()
    println(3 in setA)

    // contoh penggunaan union(gabungan) dan intersect(irisan)
    val setC = setOf(1, 6, 10)
    val union = setA.union(setC)
    val intersect = setA.intersect(setC)

    println(union)
    println(intersect)

    // set dapat menambah item, namun tidak dapat menghapus item
    val mutableSet = mutableSetOf(1, 2, 4, 5)
    println(mutableSet)
    mutableSet.add(6)
    println(mutableSet)

    println()
    // Maps
    // Maps adalah sebuah collection dengan konsep key-value

    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )
    println(capital["London"])
    println(capital.getValue("Jakarta"))

    // mengambil seluruh keys
    val mapKeys = capital.keys
    println(mapKeys)

    // mengambil seluruh values
    val mapValues = capital.values
    println(mapValues)

    // map secara default imutable, apabila ingin memanipulasi data map, maka pastikan dulu datanya bersifat mutable
    val mutableCapital = capital.toMutableMap()
    mutableCapital.put("Amsterdam", "Netherlands")
    println(mutableCapital.get("Amsterdam"))
}