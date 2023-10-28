fun divideIfWhole(value: Int, divisor: Int): Int? {
    return if (divisor != 0 && value % divisor == 0) {
        value / divisor
    } else {
        null
    }
}
fun printStatesWithLongNames(stateMap: Map<String, String>) {
    for ((stateCode, stateName) in stateMap) {
        if (stateName.length > 8) {
            println(stateName)
        }
    }
}
val factorial: (Int) -> Long = { n ->
    var result: Long = 1
    for (i in 2..n) {
        result *= i
    }
    result
}

fun main() {
    val value = 10
    val divisor = 2
    val result = divideIfWhole(value, divisor)
    // Menggunakan operator Elvis untuk mencetak pesan
    val message = result?.let { "It divides $it times" } ?: "It divides 0 times"
    println(message)

    val stateMap = mapOf("NY" to "New York", "CA" to "California", "TX" to "Texas", "FL" to "Florida")
    printStatesWithLongNames(stateMap)

    val n = 5
    val hasilFaktorial = factorial(n)
    println("Faktorial dari $n adalah $hasilFaktorial")
}


