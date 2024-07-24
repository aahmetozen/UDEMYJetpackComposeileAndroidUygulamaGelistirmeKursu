package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B3_30_Diziler

/* coklu degisken olusturmak gibi dusunulebilir
*  sabit boyutlu bir yapidir. Bastan ne kadar boyutu oldugu bellidir
*  indesk numaralarina gore veriler eklenir
*  ilk index 0 dan baslar
*  hem okunabilir hem uzerinde islem yapilabilir
*  diziler kalici depolama degildir, kalici depolama icin veri tabani kullanilir*/

fun main(){
    //Tanimlama
    // val degisken_isim=Array<tip>(boyut){icindeki eleman}
    val dizi1=Array<Int>(size = 5){0} //[0,0,0,0,0]  yani bos dizi

    val dizi2= arrayOf<Int>(1,36,9)

    val dizi3= arrayOf<String>("cilek","ahmet")

    val dizi4= arrayOf(3,8,"ahemt","bursa")

    val meyveler = arrayOf<String>("cilek","muz","elma","kivi","kiraz")

    // verilere erisim

    val str1 = meyveler[2]
    println(str1)
    println("------------------")

    val str2 = meyveler.get(3)
    println(str2)
    println("------------------")

    // veri uzerinde islem yapma (yeni veri ekleyemem ama degistirebilirim)
    meyveler[1]="Yeni Muz"

    println(meyveler.contentToString()) // dizi elemanlarini yazdirir
    println("------------------")

    meyveler.set(2,"yeni elma")
    println(meyveler.contentToString())
    println("------------------")

    // Array islemleri#
    println(meyveler.isEmpty()) // Dolu mu bos mu kontrolu
    println("------------------")

    println(meyveler.count()) // dizideki eleman sayisi
    println("------------------")

    println(meyveler.first()) // dizideki ilk eleman
    println("------------------")

    println(meyveler.last()) // dizideki son eleman
    println("------------------")

    println(meyveler.indexOf("kivi")) // dizideki elemanin hangi indexde olgunu bulur
    println("------------------")

    println(meyveler.contains("Yeni Muz")) // eleman dizide var mi yok mu kontrolu
    println("------------------")

    meyveler.sort() // diziyi siralar
    println(meyveler.contentToString())
    println("------------------")

    meyveler.reverse() // diziyi ters siralar
    println(meyveler.contentToString())




}