fun main(){
    var ab=10;
    if(ab<10){
        println("Variable value is less than 10")
    }else if(ab>10){
        println("Variable value is greater than 10");
    }else{
        println("Variable ab value is equals to $ab")
    }

    var dayOfWeek=3;
    var dayName= when(dayOfWeek){
        1->"Sunday"
        2->"Monday"
        3->"Tuesday"
        4->"Wednesday"
        else ->"Invalid day"
    }
    println("Day name $dayName")
}