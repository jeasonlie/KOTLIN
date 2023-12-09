class Karyawan(val nama: String, val jabatan: String, var gaji: Double) {
    fun naikGaji(persentase: Double) {
        gaji += gaji * persentase / 100
    }
    fun tampilkanInformasi() {
        println("Nama: $nama")
        println("Jabatan: $jabatan")
        println("Gaji: $gaji")
        println("=========================")
    }
}