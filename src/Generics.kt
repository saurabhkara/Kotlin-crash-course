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

}