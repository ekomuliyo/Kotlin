fun main(){
    val user = setUser("Eko", 23)
    println(user);

    printUser("Eko")
}

// fungsi satu baris dan langsung mengembalikan nilai dengan tipe string
fun setUser(name: String, age: Int) = "Nama saya $name, dan umur saya $age tahun"

fun printUser(name: String){
    println("nama saya $name")
}

