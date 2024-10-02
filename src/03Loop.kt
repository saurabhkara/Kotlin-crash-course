fun main(){
    for( i in 1..8 step 2){
        println("$i")
    }

    //downTo
    for( j in 5 downTo 2){
        println(j)
    }

    var counter =0
    while(counter<5){
        println("counter $counter");
        counter++
    }

    //Break statement
    for(k in 1..50){
        if(k==5){
            println("breaked");
            break;
        }
        println(k)
    }
}