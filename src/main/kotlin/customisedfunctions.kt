fun bright(){
    val myname="Bright"
    println("My name is $myname")
}
fun main(args: Array<String>) {
    bright()  //calling a function
    majina("John", "Kenya",45)
    majina("Sly", "Raha", 54)
    majina("Bryce", "Imani", 20)
    majina("Raymond", "Baraza", 28)
}
fun majina(fname:String, lname:String, age:Int){
    println("My name is $fname $lname and I am $age years old")

}
fun eacountries(name:String, locallanguage:String, population:Int){
    println("I come from $name, my local language is $locallanguage")
}