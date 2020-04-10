fun main(){

    // get color dengan when expression
    val color: Color = Color.GREEN

    when(color){
        Color.RED -> print("Color is Red")
        Color.GREEN -> print("Color is GREEN")
        Color.BLUE -> print("Color is BLUE")
    }

    println()
    // get index suatu color
    val color2: Color = Color.GREEN
    println("Position GREEN is ${color2.ordinal}")

    println()
    val colors: Array<Color> = Color.values()
    colors.forEach { c -> 
        print(c) 
    }

    println()
    val color3: Color = Color.valueOf("RED")
    print("color is $color3")

    println()
    // get isi data enum
    val blue: Int = Color.BLUE.value
    println(blue)

}

enum class Color(val value: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}