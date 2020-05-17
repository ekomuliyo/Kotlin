interface InfFly{
    fun fly()
    val numberOfWings: Int
}

class Bird(override val numberOfWings: Int) : InfFly{
    override fun fly(){
        if(numberOfWings > 0) println("Flying with $numberOfWings wings")
        else println("Im flying without wings")
    }
}

fun main(){
    val bird = Bird(2)
    bird.fly()
}