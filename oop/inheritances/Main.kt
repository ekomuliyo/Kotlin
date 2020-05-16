open class Animal(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean){
    // secara default class yang dibuat bersifat final
    // sehingga tidak bisa untuk di extends
    // maka perlu ditambahkan keyword final pada sebelum keyword class, dan semua fungsi harus pakai open juga
    open fun eat(){
        println("$name sedang makan!")
    }

    open fun sleep(){
        println("$name sedang tidur!")
    }
}

class Cat(pName: String, pWeight: Double, pAge: Int, pIsCarnivore: Boolean, val furColor: String, val numberOfFeet: Int)
    : Animal(pName, pWeight, pAge, pIsCarnivore){

    fun playWithHuman(){
        println("$name sedang bermain dengan manusia!")
    }

    override fun eat(){
        println("$name sedang makan ikan")
    }

    override fun sleep(){
        println("$name sedang tidur di lantai!")
    }
}
fun main(){
    val kucing = Cat("Kucing Meong", 3.4, 1, true, "Black", 4)
    
    kucing.playWithHuman()
    kucing.eat()
    kucing.sleep()
}