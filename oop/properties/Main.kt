class Animal {
    // kelas ini sebenarnya sudah terdeapat fungsi set dan get pada setiap properties
    var name: String = "Kucing Meong"

    // namun kita dapat override method set get, seperti dibawah ini
    var age: Int  = 3
        get(){
            return field
        }
        set(value){
            field = value
        }
}

fun main(){
    val kucing = Animal()
    println("Nama ${kucing.name}")
    kucing.name = "Meong Kedua"
    println("Nama ${kucing.name}")

    println("Umur ${kucing.age}")
    kucing.age = 2
    println("Umur ${kucing.age}")

    
}