package com.ekomuliyo

fun main(){
    // filter() untuk mencari data dari suatu array dengan kondisi di dalam lambda expresion
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 10)
    val eventList = numberList.filter { it % 2 == 0 }
    println(eventList)

    // filter() untuk mencari data yang tidak sama dengan dari kondisi di dalam lambda expresion
    val evenListNot = numberList.filterNot { it % 2 == 0 }
    println(evenListNot)

    // map() untuk memetakan / merepresentasikan setiap element-element pada array
    val multipleBy5 = numberList.map { it * 5 }
    println(multipleBy5)

    // count() untuk menghitung jumlah element array
    println(numberList.count())

    // count() dengan kondisi
    println(numberList.count{it % 2 == 0}) // mencari jumlah element yang kelipatan 2

    // find() mencari data array ketika kondisi terpenuhi dan pencarian data selanjutnya akan dihentikan / stop
    val firstOddNumber = numberList.find { it % 2 == 1 }
    println(firstOddNumber)

    // firstOrNull(), sama seperti find(), namun apabila data tidak ditemukan makan akan mengembalikan nilai null
    val firstOddNumber2 = numberList.firstOrNull{it % 2 == 0}
    println(firstOddNumber2)

    // lastOrNull(), mirip seperti firtsOrNull(), namun data yang diperiksa yang paling terkahir di ambil
    val firstOddNumber3 = numberList.lastOrNull{it % 2 == 1}
    println(firstOddNumber3)

    // first() & last() mirip sepert firstOrNull() & lastOrNull(), namun akan mengembalikan exception jika kondisi tidak terpenuhi
    val moreThan10 = numberList.last{it >= 10}
    println(moreThan10)

    // sum() untuk menjumlahkan seluruh nilai element
    val sumItem = numberList.sum()
    println(sumItem)

    // sorted, secara default mengurutkan data secara ascending / naik
    val ascendingData = numberList.sorted()
    println(ascendingData)

    // sorted descending
    val descendingData = numberList.sortedDescending()
    println(descendingData)
}