fun main(){

    val dataUser = DataUser("andi", 19)
    dataUser.intro()

    // destructuring
    val (name, age) = dataUser
    println("My Name is $name, and i am $age years old")


}

data class DataUser(val name: String, val age: Int){
    fun intro(){
        println("My Name is $name, and i am $age years old")
    }
}