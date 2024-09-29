
//List, map, set

fun main(){
    val list1= listOf("Apple","Banana",30,50);
    println(list1)

    val list2 = mutableListOf("A","B");
    list2.add("C");
    println(list2)

    val set1 = setOf(1,2,2,3,4,5,6);
    println(set1);

    val set2 = mutableSetOf(1,1,5,4,8);
    set2.add(9);
    println(set2)

    val map1 = mapOf(1 to "Saurabh");
    println(map1);

    val map2 = mutableMapOf(5 to "1000000");
    println(map2);

    map2.put(2,"ddd")
    map2[5]="500"
    println(map2)

    for(item in list1){
        println(item)
    }

}