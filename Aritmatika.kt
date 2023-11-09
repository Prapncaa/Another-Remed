package remed

fun main() {
    //Buat rumus untuk menghitung aritmatka menggunakan range
    val aritmatika = 2..10 step 2
    aritmatika.forEachIndexed { index, angka1 ->
        println(angka1)
    }

}