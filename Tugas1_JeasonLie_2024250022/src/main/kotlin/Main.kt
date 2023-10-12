fun main(){

    //Jawaban soal nomor 1
    var age = 16
    println(age)
    age = 30
    println(age)

    println()

    //Jawaban soal nomor 2
    val degree: Double = 360.00
    val radian: Double = degree*(Math.PI/180)

    println("Sudut dalam radian: $radian")

    println()

    //Jawaban soal nomor 3
    val coordinates = Pair(2, 3)
    val (row, column) = coordinates

    println("row: $row")
    println("column: $column")

    println()

    //Jawaban soal nomor 4
    fun tahunKabisat(tahun: Int): Boolean {
        return (tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)
    }

    fun hariDalamSebulan(bulan: String, tahun: Int): Int {
        val lowercaseBulan = bulan.lowercase()

        return when (lowercaseBulan) {
            "januari", "maret", "mei", "juli", "agustus", "oktober", "desember" -> 31
            "april", "juni", "september", "november" -> 30
            "februari" -> if (tahunKabisat(tahun)) 29 else 28
            else -> throw IllegalArgumentException("Bulan yang dimasukkan tidak valid.")
        }
    }

    val bulan = "Februari"
    val tahun = 2023
    val hari = hariDalamSebulan(bulan, tahun)
    println("Jumlah hari dalam $bulan $tahun adalah $hari hari.")

    println()

    //Jawaban soal nomor 5
    fun fibonacci(n: Int): Int {
        if (n <= 0) {
            throw IllegalArgumentException()
        } else if (n == 1 || n == 2) {
            return 1
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2)
        }
    }

    val n = 10
    val result = fibonacci(n)
    println("Nilai Fibonacci ke-$n adalah $result")

}
