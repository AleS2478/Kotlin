open class Vehicle(
    val make: String,
    val model: String,
    val year: Int
)

fun main(){
    val c1 = Vehicle ("Ford", "Mustang", 2021)
    println(c1.make)
    println(c1.model)
    println(c1.year)
}