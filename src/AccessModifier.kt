
//Punlic Keyword
class PublicClass(){

    val publicInfo :String = "Public Info";
    private val privateInfo :String = "Private Info";
    fun returnPrivateInfo():String{
        return privateInfo
    }
}

//Intenal Keyword

internal class InternalClass(){
    internal var internalInfo:String = "Internal Info";
}

//Protected keyword

open class ParentClass(){
    protected var protectedInfo:String= "Protected Info";

}

class ChildClass():ParentClass(){
    fun getProtectedInfoH():String{
       return protectedInfo
    }
}

fun main(){
    val publicClass = PublicClass();
    println(publicClass.publicInfo);
    println(publicClass.returnPrivateInfo());

    val internalClass = InternalClass();
    println(internalClass.internalInfo)

    val parentClass = ParentClass();
    val childClass = ChildClass()
    childClass.getProtectedInfoH()
}