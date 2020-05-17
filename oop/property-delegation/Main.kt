import kotlin.reflect.KProperty

class DelegateNameString {
    private var value: String = "default-value"

    operator fun getValue(classRef: Any?, property: KProperty<*>) : String {
        println("fungsi getter property ${property.name} classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String){
        println("fungsi setter, dari nilai $value menjadi $newValue")
        value = newValue
    }
}

class Animal {
    // tipe data String
    var name: String by DelegateNameString()

    // tipe data apapun (Any)
    var weight: Any by DeletegateGenericClass()
    var age: Any by DeletegateGenericClass()
    var isMamalia: Any by DeletegateGenericClass()
}

class DeletegateGenericClass{
    private var value: Any = "default-value"

    operator fun getValue(classRef: Any, property: KProperty<*>): Any {
        println("fungsi getter property ${property.name} classRef")
        return value
    }

    operator fun setValue(classRef: Any, property: KProperty<*>, newValue: Any) {
        println("fungsi setter, dari nilai $value menjadi $newValue")
        value = newValue
    }
}


fun main(){
    // property delegation, adalah memungkinkan kita membuat fungsi setter dan getter dari sebuah class
    // namun penulisan setter dan getter tidak dilakukan di class tsb, melainkan di class delegate
    // dibawah ini contoh delegate hanya tipe data String
    val animal = Animal()
    animal.name = "kucing meong" // fungsi setter
    println("nama hewan : ${animal.name}") // fungsi getter


    // ini contoh delegate tipe data apapun (Any)
    animal.weight = 2.1
    animal.age = 3
    animal.isMamalia = true
    println("berat : ${animal.weight}, umur : ${animal.age}, mamalia : ${animal.isMamalia}")
}