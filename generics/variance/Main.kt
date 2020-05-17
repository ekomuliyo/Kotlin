abstract class Vehicle(var wheel: Int){
    open fun numberOfWheel(){
        println("jumlah roda $wheel")
    }
}

class Car(var speed: Int) : Vehicle(4){
    fun speedCar(){
        println("kecepatan mobil $speed")
    }
}

class MotorCycle(var speed: Int) : Vehicle(2){
    fun speedMotorCycle(){
        println("kecepatan motor $speed")
    }
}

fun main(){
    val car = Car(200)
    val motorcycle = MotorCycle(100)

    var vehicle: Vehicle
    vehicle = car
    vehicle = motorcycle

    println(vehicle)

    // val carList = listOf(Car(100), Car(200))
    // val vehicleList = carList
    
}

// covariant, kata kunci nya adalah out sebelum type parameter dari generic
// covariant type parameter nya hanya bisa diproduksi atau menjadikan nya return type,
// tidak untuk dikonsumsi
interface List<out T> : Collection<T> {
    operator fun get(index: Int) : T
}

// contravarian, kebalikan dari covarian
// covariant type parameter nya hanya bisa diproduksi atau type data nya dapat digunakan pada setiap fungsi didalamnya
// namun tidak dapat untuk diproduksi atau return type
interface Compareable<in T> {
    operator fun compareTo(other: T) : Int
}