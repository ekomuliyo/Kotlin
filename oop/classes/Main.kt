class Animal (val name: String, val weight: Double, val age: Int, val isMamalia: Boolean){
    fun eat(){
        println("$name makan!")
    }
    fun sleep(){
        println("$name tidur!")
    }
}

fun main(){
    val cat = Animal("Kucing Meong", 5.2, 3, true)

    println("Nama : ${cat.name}, Berat : ${cat.weight}, Umur : ${cat.age}, Mamalia : ${cat.isMamalia}")
    cat.eat()
    cat.sleep()
}