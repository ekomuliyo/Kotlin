fun main() {
    println("Factorial 3 is : ${factorial(3)}")
}


// keyword tailrec, agar fungsi tersebut hanya boleh dipanggil untuk dijalankan waktu terakhir dan mengembalikan nilainya
// dalam kasus dibawah ini adalah mencari nilai faktorial
// dimana setiap nilai n akan dikurangkan 1 (n-1) setiap pemanggilan fungsi nya sendiri / function recursive
// dan ketika nilai (n-1) menghasilkan 0, maka fungsi akan berakhir dan posisi akhir tersebut akan mengembalikan nilai
// yang telah dilalui dari proses function recursive sebelumnya

tailrec fun factorial(n: Int, result: Int = 1): Int{
    val newResult = n * result
    return if(n == 1){
        newResult
    }
    else{
        factorial(n - 1, newResult)
    }
}