fun main() {
    // fold, melakukan perhitungan di dalam sebuah collection tanpa melakukan iterasi
    val numbers = listOf(2, 3, 5)
    val fold = numbers.fold(10) {current, item -> // 10 adalah nilai awal
        print("current $current, ")
        print("item $item")
        println()
        current + item
    }   

    println("fold result $fold")

    println()
    // foldRight, sama seperti fold, namun dimulai dari current nya dimulai dari posisi terakhir
    val numbers2 = listOf(10, 20, 30)
    val fold2 = numbers2.foldRight(20) { item, current -> 
        print("current $current, ")
        print("item $item")
        println()
        current + item
    }

    println("fold2 result : $fold2")

    println()
    // drop, memangkas atau memotong dari sebuah collection sesuai nilai yang kita tentukan
    val numbers3 = listOf(2, 2, 4, 4, 1, 1, 6, 6)
    val drop = numbers3.drop(3) // 3 artinya adalah memotong nilai dari list 1 - 3
    println(drop); // [4, 1, 1, 6, 6]

    println()
    // dropLast, sama seperti drop namun pemotongan dimulai dari index terakhir
    val numbers4 = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    val dropLast = numbers4.dropLast(3)
    println(dropLast) // [1, 2, 3, 4, 5]

    println()
    // take, mengambil item dari dari collection dengan jumlah yang ditentukan
    val numbers5 = listOf(1, 5, 4, 2, 3)
    val take = numbers5.take(2)
    println(take) // [1, 5]

    println()
    // takeLast, mirip seperti take, namun nilai yang diambil dimulai dari index terakhir
    val numbers6 = listOf(2, 3, 5)
    val takeLast = numbers6.takeLast(2)
    println(takeLast) // [3, 5]

    println()
    // slice, memotong sebuah collection dengan range yang kita tentukan
    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice = total.slice(2..6)
    val slice2 = total.slice(2..6 step 2)
    
    val index = listOf(2, 4, 6, 8)
    val slice3 = total.slice(index)
    
    println(slice)
    println(slice2)
    println(slice3)

    println()
    // distinct, untuk menghilangkan data yang sama di dalam collection
    val total2 = listOf(1, 1, 2, 2, 5, 5, 3, 7, 8)
    val distinct = total2.distinct()
    println(distinct)

    // disctinct pada object collection
    data class Item(val key: String, val value: String)
    val items = listOf(
        Item("1", "Kotlin"),
        Item("2", "is"),
        Item("3", "awesome"),
        Item("3", "as"),
        Item("3", "programming"),
        Item("3", "language")
    )

    val distinctItems = items.distinctBy { it.key }
    distinctItems.forEach { 
        println("${it.key} with value ${it.value}")
     }

    //  melakukan distinct dengan kondisi tertentu, pada contoh dibawah melakukan distinct pada kalimat yang mempunyai length / panjang huruf sama
    val text = listOf("A", "B", "CC", "DD", "F", "GGGG")
    val distinct2 = text.distinctBy{
        it.length
    }
    println(distinct2) 
    // note : distinct tidak bisa dilakukan pada collection map

    println()
    // chunked, memecah nilai string dengan menentukan jumlah index yang akan menjadi pemisah setiap kalimat
    val word = "QWERTY"
    val chunkedTransform = word.chunked(2){
        it.toString().toLowerCase()
    }

    println(chunkedTransform)
}