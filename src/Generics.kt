fun main(){

    fun <T> printElements(elements:List<T>){
        for(element in elements){
            println(element)
        }
    }

    printElements(listOf(1,2,2,5))
    printElements(listOf("Horse","Game"))


    class Box<T>(private val content:T){

        fun getContent():T{
            return content
        }
    }

    val stringBox= Box("Saurabh");
    val numberBox= Box(5);
    println(stringBox.getContent());
    println(numberBox.getContent());


    //Null Safety
    var test2: String?= "Saurabh";
    test2=null
    println(test2)

    //Safe Calls

    var length:Int? = test2?.length 
    println(length)

    //Elvis Operator

    var lengthOrZero:Int= test2?.length ?: 0;
    println(lengthOrZero);

    //Safe cast

    var obj:Any = "I am String";
    val str:String?= obj as? String;
    val str2:Int? = lengthOrZero as Int;
    println(str)
    println(str2)

}