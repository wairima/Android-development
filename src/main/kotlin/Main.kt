fun main(  args: Array<String>) {
    println(11+11)
    println("Hello world")
    println("y=4")

var jina="eMobilis"
    println("I do coding classes at $jina")
    println("I do coding at +jina")
    println("$jina")
    println(jina)
    var num=45
    var num1=53
    //qn the sum of 45 and 53 is 98
    println("The sum of $num and $num1 is ${num+num1}")
    println("The product of $num and $num1 is ${num*num1}")
    println("The quotient of $num and $num1 is ${num/num1}")

    //TypeCasting- its changing from one dt to another
    //Datatypes include;
    //numbers-integers,short,long,float(always ends in f),double
    //boolean-something either true/false
    //character-its a single number
    //string
    //arrays
    //-After assigning a var the next statement should begin in caps
    var numb:Int=345
    var numb1:Short=6767
    var numb2:Float=45.45f
    var char:Char='b'
    var myname:String="erick"
    var mybool:Boolean=true
    var numb3:Double=23.12

    println("$numb is int")
    println("$numb1 is short")
    println("$numb2 is float")
    println("$char is char")
    println("$numb3 is double")
    println("$mybool is boolean")
    println("$myname is string")

    //how to change from one data type to another using type casting

    println("$numb1 to float is ${numb1.toFloat()}")
    println("$char to double is ${char.toDouble()}")
    println("$numb3 to float is ${numb3.toFloat()}")

}