fun main(){
    // named argument berguna ketika kita ingin passing variabel ke fungsi,
    // tidak perlu mengetahui urutan parameter dari fungsi cukup dengan mengetahu nama variabel nya saja

    val fullName = getFullName(middle = "Eko", last = "Muliyo", first = "Mr")
    println(fullName);

    println(getFullName())
}

// mengatur default value sebuah fungsi
fun getFullName(first: String = "kotlin", middle: String = "is", last: String = "awesome"): String{
    return "$first $middle $last"
}