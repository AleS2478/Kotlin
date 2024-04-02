fun main() {
    println("Enter the movie rating (G, PG, R):")
    val movieRating = readLine().toString()

    println("Enter your age:")
    val age = readLine()?.toIntOrNull() ?: 0

    val allowed = isAllowedToWatch(movieRating, age)

    if (allowed) {
        println("You are allowed to see the movie in a theater")
    } else {
        println("You are not allowed to see the movie in a theater")
    }
}
    fun isAllowedToWatch(movieRating: String, age: Int): Boolean {
        return when (movieRating) {
            "G" -> true
            "PG" -> age >= 7
            "R" -> age >= 17
            else -> false
        }
    }