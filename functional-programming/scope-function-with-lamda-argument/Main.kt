fun main() {

    // let menggunakan argument (it) untuk mengakses object konteksnya
    // let biasanya digunakan untuk object yang kemungkinan akan bernilai null
    // dan fungsi run akan dijalankan apabila kondisi bernilai null
    val message: String? = null
    message?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    }.run{
        val text = "message is null"
        println(text)
    }

    // also mirip seperti apply, nilai yang dikembalikan adalah nilai dari konteks objectnya
    // konteks object tersedia sebagai argument (it)
    // biasanya also digunakan untuk melakukan sesuatu terhadap object konteks sebagai argument tanpa mengubah nilai aslinya
    val text = "Hello Kotlin"
    val result = text.also{
        println("value length -> ${it.length}")
    }
    println("value -> $result")
}
