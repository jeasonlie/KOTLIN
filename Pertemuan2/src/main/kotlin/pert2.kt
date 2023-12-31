fun main(){
    println("Hello World")

    //Contoh Komentar, shortcut = CTRL + /

    /*Contoh komentar lebih
      dari satu baris
      contoh komentar lebih
      dari 1 baris*/

    var nama: String = "Jeason Lie"
    println("Nama : "+nama) //String concatenation
    //nama = "8tat"
    //println("Nama : $nama") //String interpolation

    var tempatLahir = "Palembang"
    println("Nama saya $nama dan saya lahir di $tempatLahir")

    //var dan val
    //var = nilai masih bisa diubah
    //val (constanta) = nilai tidak bisa diubah
    val usia = 22
    //usia = 15 --> Val cannot be reassigned
    var usiaSaatIni = 22
    println("Tahun ini, saya $nama berusia $usiaSaatIni tahun")
    println("Tahun depan, saya $nama berusia ${usiaSaatIni++} tahun")
    println("Tahun depan, saya $nama berusia ${usiaSaatIni++} tahun")
    println("Tahun depan, saya $nama berusia ${usiaSaatIni++} tahun")
    println("Tahun depan, saya $nama berusia ${usiaSaatIni++} tahun")

    val angka1: Int = 10
    val angka2 = 20
    println("$angka1 + $angka2 = ${angka1+angka2}")

    val firstName = "Kujoh"
    val lastName = "Jotaro"
    println("Nama Lengkap = $firstName $lastName")
    println("Inisial = " + firstName[0] + lastName[0])
    println("Inisial = ${firstName[0]}${lastName[0]}")

    //Tipe data Char
    var huruf = 'a'
    println("Huruf ${huruf++}")
    println("Huruf ${huruf++}")
    println("Huruf ${huruf++}")
    println("Huruf ${huruf++}")
    println("Huruf ${huruf++}")
    println("Huruf ${huruf++}")
    println("Huruf ${huruf++}")

    //Escaped String (\n, \t, \", \', \\)
    val kalimat = "Kotlin itu \"Mudah\"!"
    println(kalimat)
}