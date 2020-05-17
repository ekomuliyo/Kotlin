// secara default modifier adalah public
class Animal(val name: String, val weight: Double, val age: Int, val isMamalia: Boolean){}

// private
class Animal2(private var name: String, private var weight: Double, private var age: Int, private var isMamalia: Boolean){

    // menambahkan fungsi set dan get untuk mengubah properties
    fun getName(): String{
        return name
    }

    fun setName(newName: String){
        name = newName
    }
}

// protected
open class Animal3(val name: String, open protected val weight: Double){}
class Cat(name: String, weight: Double) : Animal3(name, weight){
    
    fun weightValue(): Double{
        return weight
    }
    
    override val weight = weight 
}

// internal, adalah modifier yang hanya dapat diakses oleh class modul yang sama
open class Outer{
    internal val c = 3
}

class Unrelated(o: Outer){
    val a = o.c
}

fun main(){
    val kucing = Animal("kucing meong", 2.4, 4, true)
    println(kucing)

    val kucing2 = Animal2("kucing meong 2", 2.6, 2, true)
    println(kucing2.getName());
    kucing2.setName("kucing meong 2 baru")
    println(kucing2.getName())

    val kucing3 = Cat("kucing meong 3", 2.1)
    println(kucing3.name) 
    // println(kucing3.weight) // ini error karena properties protected diakses bukan dari anak kelas Animal 3
    println(kucing3.weightValue()) // untuk mengakali nya yaitu mengoverride properties yg protected di class anak / sub, trs buat fungsi yg mengembalikan nilai tsb, namun ini tidak disarankan


    val unrelated = Unrelated(Outer())
    println(unrelated.a)
}