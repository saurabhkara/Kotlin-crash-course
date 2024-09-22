fun main(){
    fun sum(a:Int,b:Int=5):Int{
        return a+b;
    }

    println(sum(5))

    //Lambda function or arrow function
    var addition :(Int,Int)->Int={x,y->x+y};
    println(addition(5,4))

    //anonymous function 
    var multiply = fun(x:Int,y:Int):Int{
        return x * y;
    }
    println(multiply(5,4))
}