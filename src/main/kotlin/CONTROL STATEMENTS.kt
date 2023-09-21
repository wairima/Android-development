fun main(args: Array<String>) {

    print("Student marks")
    val input= readLine()
    if (input != null){
        val score=input.toIntOrNull()
        if (score != null){
            val grade=if (score in 80..100){
                "DISTINCTION"
            }else if (score in 60 until 79){
                "CREDIT"
            }else if (score in 40 until 59){
                "PASS"
            }else{
                "FAIL"
            }
                println("Score: $score")
                println("Grade: $grade")
        }else{
                println("Wrong marks")
        }
    }else{
        println("CRNM")
    }
}