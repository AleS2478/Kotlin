// VarAndVal/Task1.kt
package varAndValExercise1

fun main() {
    val first = "Ignacio"
    val last = "Suarez"
    var age = "15"

    println("Hello World! My name is $first $last, and I'm $age years old.")
    println("Did I tell you my fist name is $first?")

    age += 5
    println("Would you believe I'm $age years old?")

  // TODO

    print("What day is it today? ")
    val day = readLine()!!
    println(day)
}