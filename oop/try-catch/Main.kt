fun main(){
    val someNullValue: String? = null
    lateinit var someMustNotNullValue: String // lateinit adalah menandakan bahwa variabel tsb non-null / tidak boleh null

    try{
        // tanda seru (!!) digunakan untuk mengabaikan nilai null dari variabel tsb
        // sedangakan someNullValue isinya null, maka dalam hal ini perlu ditambahkan tanda seru
        someMustNotNullValue = someNullValue!! 
    }catch(e: Exception){
        someMustNotNullValue = "Nilai String Null"
    }finally{
        println(someMustNotNullValue)
    }

    // multiple catch
    val someStringValue: String? = null
    var someIntValue = 0

    try{
        someIntValue = someStringValue!!.toInt()
    }catch(e: NullPointerException){
        // dilemparkan kesini jika nilai someIntValue = null
        someIntValue = 0 
    }catch(e: NumberFormatException){
        // dilemparkan kesini jika nilai someIntValue buka nilai Int
        someIntValue = -1
    }finally{
        when(someIntValue){
            0 -> println("block NullPointerException terpanggil")
            1 -> println("block NumberFormatException terpanggil")
            else -> println(someIntValue)
        }
    }
}