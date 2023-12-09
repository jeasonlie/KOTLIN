fun main(args: Array<String>) {
    val perusahaan = Perusahaan()

    val karyawan1 = Karyawan("John Doe", "Manager", 5000.0)
    val karyawan2 = Karyawan("Jane Doe", "Programmer", 4000.0)
    val karyawan3 = Karyawan("Bob Smith", "Designer", 4500.0)

    perusahaan.tambahKaryawan(karyawan1)
    perusahaan.tambahKaryawan(karyawan2)
    perusahaan.tambahKaryawan(karyawan3)

    println("Informasi Karyawan Sebelum Naik Gaji:")
    perusahaan.tampilkanInformasiKaryawan()

    karyawan1.naikGaji(10.0)

    println("Informasi Karyawan Setelah Naik Gaji:")
    perusahaan.tampilkanInformasiKaryawan()
}