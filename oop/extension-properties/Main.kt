class Animal(var name: String, var weight: Double, var age: Int, var isMamalia: Boolean)

val Animal.getAnimalInfo : String
    get() = "Nama : ${this.name}, Berat : ${this.weight}, Umur : ${this.age}, Mamalia : ${this.isMamalia}"

fun main(){
    // extension properties adalah, memungkinkan kita menambahkan fungsi tanpa harus mewarisi kelas tsb
    val kucing = Animal("kucing meong", 2.3, 5, true)
    println(kucing.getAnimalInfo)
}