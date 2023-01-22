import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MainKtTest{
    @Test
    fun calculationAmount() {
       val amount: Double = 100.00
        val amountOfTransfer: Double = 100.00

        val result = calculationAmount(amount, amountOfTransfer)
        kotlin.test.assertEquals(expected = 100.00, actual = result)


    }

}