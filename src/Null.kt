fun main() {

    //var name : String = "Abhay"  // In kotlin -> Must initiliaized

    var name : String?  // Null value can be accepted ...
    name = null
    println(name)
    //println(name.length)  // Error bcoz its  null valu

    // Option 1

    println(
        if (name == null) {
            -1
        }
        else {
            name.length
        }
    )

    // Option 2 -> Safe call

    println(name?.length)

    // Option 3 -> !!

}