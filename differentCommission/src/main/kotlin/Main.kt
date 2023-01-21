fun main() {
    val transfer = transferPayment(12_000.0)
    val transfer_2 = transferPayment(12_000.0, typeCard = "Maestro", amountOfTransfer = 65_000.0)
}

fun transferPayment(amount: Double, typeCard: String = "VK Pay", amountOfTransfer: Double = 0.0) {
    when (typeCard) {
        "VK Pay" -> println("Сумма вашего первода $amount рублей")
        "Maestro", "MasterCard" -> calculationAmount(amount, amountOfTransfer)
    }
}

fun calculationAmount(amount: Double, amountOfTransfer: Double) {
    val totalAmount = amount + amountOfTransfer
    val commission = amount * 0.006 + 20
    val totalSum = totalAmount + commission
    when (totalAmount) {
        in 0.0..74_999.0 -> println("Сумма вашего первода $amount рублей")
        else -> println(
            """Сумма вашего первода $amount и дополнительная комиссия $commission, 
            общая сумма перевода $totalSum  рублей""".trimMargin()
        )
    }
}