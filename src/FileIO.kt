// File IO
import java.io.File;
import java.io.IOException;


fun main(){
 
    val file = "example.txt";
    val fileContent= "File is created";

    try{
        File(file).writeText(fileContent);
        println("Wtiting file")
    }catch(e:IOException){
        println("Exception ${e.message}")
    }

    try{

        val content = File(file).readText();
        println("Content of file ${content}")

    }catch(e:IOException){
        println("Exception occured")
    }

    val filePath = File(file).absolutePath;
    val filePath2 = File(file).parent
    println(filePath);
    println(filePath2);

    val fileProperties = File(file);
    if(fileProperties.exists()){
        println(fileProperties.length());
        println(fileProperties.canRead());
        println(fileProperties.canWrite());
        println(fileProperties.canExecute());
    }else{
        println("File donot exist")
    }

}