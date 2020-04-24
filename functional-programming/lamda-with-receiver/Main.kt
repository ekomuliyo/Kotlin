fun main(){
    // mengakses object receiver dari dalam extension

    // pemanggilan fungsi cukup satu argument saja, karna cman ada expression lamda saja
    val message = buildString {
        append("hello ")
        append("from ")
        append("lamda")
    }

    println(message)

}

fun buildString(action: StringBuilder.() -> Unit): String{
    val stringBuilder = StringBuilder()
    stringBuilder.action() // variabel parameter action hanya bisa diakses dari tipe StringBuilder()
    return stringBuilder.toString()
}