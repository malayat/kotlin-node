external fun require(module: String): dynamic

fun main(args: Array<String>) {
    val express = require("express")
    val app = express()

    app.get("/crypto") { _, res ->
        res.send(generateCryptoCurrencies())
    }

    app.listen(3000) {
        println("listening on port 3000")
    }
}

class CryptoCurrency(
        val name: String,
        val price: Float
)

fun generateCryptoCurrencies(): Array<CryptoCurrency> = arrayOf(
        CryptoCurrency("Bitcoin", 9000F),
        CryptoCurrency("ETH", 1000F),
        CryptoCurrency("TRX", 10F)
)