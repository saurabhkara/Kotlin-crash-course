
//Lambda Function

fun main(){

    val greet:(String,String)->Unit={name,lastName-> println("Hello $name $lastName")};
    greet("Saurabh","Kumar")

    //Higher order Functions
    val numbers = listOf(1,2,3,4,5);
    val doubleNumber= numbers.map{it*2};
    println(doubleNumber)
}