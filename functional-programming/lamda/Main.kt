fun main(){
    hello()

    helloWithParams("hello lamda with params")
}

val hello = { println("hello")}

val helloWithParams = { message: String -> print(message)}