fun main(){
    // kotlin akan mendeteksi error nilai variabel text ketika compile
    // val text: String = null // compile errror

    // untuk mengatasi nya, dengan menggunakan tanda tanda setelah tipe data
    // ini memungkinkan untuk mendefinisikan variabel yang bisa diisi dengan nilai nul
    val text: String? = null
    
    if(text != null){
        val textLength = text.length
        print(textLength)
    }

    // safe call adalah sebuah metode pemanggilan sebuah nilai,
    // jika isinya null maka proses akan dilewatkan
    val text2: String? = null
    print(text2?.length)
}