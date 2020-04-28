fun main(){
    
    // run akan mengembalikan nilai berdasarkan expression yang berada dalam lamda
    // untuk mengakses konteks object menggunakan receiver (this)
    // biasanya run digunakan apabila object ingin inisialisasi dan dilakukan perhitungan untuk kembalian nilai nya
    val text = "Hello"
    val result = text.run {
        val from = this
        val to = this.replace("Hello", "Kotlin")
        "replace text $from to $to"
    }
    println(result);


    // with bukan sebuah extension melainkan hanya fungsi biasa, 
    // objek nya di masukan sebagai argumen yang akan menjadi receiver (this)
    // biasanya with digunakan untuk mengakses anggota object nya tanpa mengembalikan sebuah nilai
    val message = "Hello Kotlin"
    val result2 = with(message){
        "First character is ${this[0]}" +
            " and las character is ${this[this.length - 1]}"
    }
    println(result2)

    // apply nilai yang dikembalikan adalah nilai dari konteks objectnya,
    // konteks objectny tersedia sebagai receiver(this)
    data class Person(var name: String, var age: Int)
    var person = Person("andi", 19)
    person.apply { this.age = 20}
    println(person)



}