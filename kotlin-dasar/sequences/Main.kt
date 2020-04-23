fun main(){
    // sequences memiliki sifat lazy evaluation, 
    // mengeveluasi jika benar-benar dibutuhkan atau melakukan evaluasi yang perlu saja

    // berbeda dengan collection yang ada pada list, sets, map, memiliki sifat eager evaluation
    // mengevaluasi semua item yang ada pada collection tsb

    // contoh sifat eager evaluation
    val list = (1..1000000).toList()
    list.filter { it % 5 == 0 }.map { it * 2 }.forEach{ println(it) } // membutuhkan waktu > 3 detik
    // metode diatas, memfilter list dengan kelipatan 5 , lalu di map, kemudian di println() sebanyak 1000000
    // tentu metode diatas kalau data banyak tidak efisien dari sisi waktu

    // contoh sifat lazy evaluation
    val list2 = (1..1000000).toList()
    list2.asSequence().filter{ it % 5 == 0 }.map { it * 2 }.forEach { println(it) } // membutuhkan waktu <= 3 detik

    // membuat object sequences
    val sequenceNumber = generateSequence(1) { it + 1 }
    sequenceNumber.take(5).forEach { println("$it ") } // take(5) membatasi jumlah sequence, kalau tidak ditambahkan akan terus menambah 1


}