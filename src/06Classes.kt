class Person(var name:String,val age:Int){
   fun introduce(){
        println("Person $name class method called at $age")
    }
}


//get method

class Rectangle(var length:Int,var width:Int){

    val perimeter:Int
        get()= 2 *(width + length)

    fun area():Int{
        return this.length * this.width
    }
}


class Cylinder(val radius:Int,val height:Int){

    constructor(radius:Int):this(radius,1)

    fun volume():Double{
        return Math.PI * radius * radius * height;
    }
}


// Inheritance 

open class Animal(val name:String){

   open fun makeSound(){
        println("Animal making sound $name")
    }
}

class Dog( name: String):Animal(name){
    override fun makeSound(){
        println("$name dog is barking")
    }
}


// Interface

interface Shape{
    fun draw()
}

class Triangle:Shape{
    override fun draw(){
        println("Drawing Triangle")
    }
}

fun main(){

    var person = Person("Saurabh",30);
    person.introduce();

    var rectangle = Rectangle(20,15);
    println(rectangle.area())
    println(rectangle.perimeter);

    val cylinder = Cylinder(3);
    println(cylinder.volume())

    val animal = Animal("Dog");
    animal.makeSound()
    val dog = Dog("Tommy");
    dog.makeSound()

    val triangle = Triangle();
    triangle.draw()

}