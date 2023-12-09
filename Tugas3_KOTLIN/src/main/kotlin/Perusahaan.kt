class Perusahaan {
    private val daftarKaryawan = mutableListOf<Karyawan>()
    fun tambahKaryawan(karyawan: Karyawan) {
        daftarKaryawan.add(karyawan)
    }
    fun tampilkanInformasiKaryawan() {
        println("Informasi Karyawan di Perusahaan:")
        for (karyawan in daftarKaryawan) {
            karyawan.tampilkanInformasi()
        }
    }
}