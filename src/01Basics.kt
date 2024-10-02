// var is mutuable and val is immutable
const val name= "Saurabh kumar"
const val PI :Double= 3.14
fun main (){
    var a=10;
    val b="Saurabh"
    println(a);
    a=15;
    println(a);
    println(b)
    println(name)
    println(PI)
    var ab:Int=10;
    var ac:Double=45.5;
    var ad:Float=45.865F;
    var ae:Boolean=false;
    var af:Long=10000L
    var stringLiteral:String = "Learning Kotlin is fun";
    println("String Literals : $stringLiteral");
}