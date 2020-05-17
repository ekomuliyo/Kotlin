abstract class Animal(var name: String, var weight: Double, var age: Int, var isCanivore: Boolean){
    open fun eat(){
        println("$name sedang makan!")
    }

    open fun sleep(){
        println("$name sedang tidur")
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
    // abstract class biasanya digunakan untuk parent class
    // karena dia tidak dapat dibuat/instansiasi object sendiri
    // melainkan hanya dapat dibuat dari child class nya
    val animal = Animal("kucing", 2.4, 2, true) // error
    animal.sleep()

    val cat = Cat("kucing", 2.1, 1, true, "biru", 4)
    cat.sleep()
}