class Animal(pName: String, pWeight: Double, pAge: Int){
    val name: String
    val weight: Double
    val age: Int
    var isMamalia: Boolean

    // fungsi init dijalankan ketika object ini dibuat
    // biasanya digunakan untuk validasi object
    init{
        weight = if(pWeight < 0) 0.1 else pWeight
        age = if(pAge < 0) 0 else pAge
        name = pName
        isMamalia = false
    }

    // secondary constructor
    constructor(name: String, weight: Double, age: Int, isMamalia: Boolean): this(name, weight, age){
        this.isMamalia = isMamalia
    }
}

// default constructor
class Animal2{
    val name: String = "Meong 3"
    val weight: Double = 3.1
    val age: Int = 1
    val isMamalia = true
}

fun main(){

    // consctructor di kotlin ada 3 jenis
    // 1. primary constructor
    // 2. secondary constructor
    // 3. default constructor

    // primary constructor
    // apabila ingin memanggil class maka wajib mengisi nilai properties 
    val cat = Animal("Meong", 5.2, 3)
    println("Nama : ${cat.name}, Berat : ${cat.weight}, Umur : ${cat.age}, Mamalia : ${cat.isMamalia}")
    
    // secondary constructor
    // sebuah kondisi apabila sebuah object yang diberikan tidak terdapat pada primary constructor, 
    // kita dapat memberikan di properties tsb di secondary constructor
    val cat2 = Animal("Meong kedua", 5.2, 3, true)
    println("Nama : ${cat2.name}, Berat : ${cat2.weight}, Umur : ${cat2.age}, Mamalia : ${cat2.isMamalia}")
    
    // default constructor
    // kondisi dimana object class otomatis terdapat constructor default
    // yaitu kita dapat memanggil class tanpa memberikan nilai properties nya
    val cat3 = Animal2()
    println("Nama : ${cat3.name}, Berat : ${cat3.weight}, Umur : ${cat3.age}, Mamalia : ${cat3.isMamalia}")

}