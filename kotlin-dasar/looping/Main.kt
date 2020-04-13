fun main(){
    // while
    var counter = 1
    while(counter <= 7){
        println("hellow world!")
        counter++
    }

    // do while
    var counter2 = 1
    do{
        println("hello world!")
        counter2++
    }while(counter2 <= 7)

    // for loop
    val ranges = 1..5
    for (i in ranges){
        println("value is $i!")
    }
    val ranges2 = 1.rangeTo(5)
    for (i in ranges2){
        println("value is $i")
    }

    // for loop expression withIndex
    val ranges3 = 1.rangeTo(10) step 3
    for ((index, value) in ranges3.withIndex()){
        println("value $value with index $index")
    }

    // loop expression forEach
    val ranges4 = 1.rangeTo(10) step 3
    ranges4.forEach { value ->  
        println("value is $value!!")
    }

    // loop expression forEach withIndexed
    val ranges5 = 1.rangeTo(10) step 3
    ranges5.forEachIndexed {index, value ->
        println("value $value withIndexed $index")
    }

}