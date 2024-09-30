
fun main(){
    try{
        var num = 10/0;
    }catch(e :ArithmeticException){
        println("Catch block $e")
    }finally{
        println("Hamesa hi call ho jaunga")
    }
}