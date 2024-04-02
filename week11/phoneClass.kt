class CellPhones(
    val brand: String,
    val model: String,
    val price: Int
)

fun main() {
    val cp1 = CellPhones("Samsung", "Galaxy Tab S9 Series.", 1099)
    val cp2 = CellPhones("LG", "W41 Pro", 800)

    println(cp1.brand)
    println(cp1.model)
    println("\$${cp1.price}")
    println(cp2.brand)
    println(cp2.model)
    println("\$${cp2.price}")
}