fun celsius(fahrenheit: Int): Double {
    val celsius = (5.0 / 9) * (fahrenheit - 32)
    return celsius
}

fun main() {
    println("Fahrenheit /t Celsius")
    println("------------------------")
    for (f in 0..20) {
        val c = celsius(f)
        println("$f / $c")
    }
}