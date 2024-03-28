fun fallingDistance(t: Int): Double {
    val g = 9.8
    val d = 0.5 * g * (t.toDouble() * t.toDouble())
    return d
}

fun main() {
    //Demonstrate the function by calling it in a loop for times 1 through 10
    for (time in 1..10){
        val distance = fallingDistance(time)
        println("Time: $time seconds, Distance: $distance meters")
    }
}