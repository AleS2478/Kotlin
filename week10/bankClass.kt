class BankAccount(
    val accountNumber: String,
    val balance: Int,
    val ownerName: String
)

fun main(){
    val c1 = BankAccount ("123456789123", 500, "Alejandro Suarez")
    println(c1.accountNumber)
    println(c1.balance)
    println(c1.ownerName)
}