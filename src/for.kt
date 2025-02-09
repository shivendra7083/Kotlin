fun main() {

    // for loop

    for (i in 1..5) {
        println("Number: $i")
    }
    println()

    // Loop from 1 to 4 (until excludes 5)
        for (i in 1 until 5) {
            println("Number $i")
        }
    println()

        // print reverse no
    for (i in 5 downTo 1 ) {
        println("Number: $i")
    }
    println()


    // Lets print the text of word
    var name = "Abhay"
    for (eachtext in name) {
        println(eachtext)
    }
}