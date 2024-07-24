package com.jetpackcomposeileandroiduyggelistirmekursuudmy

// sabitler icersinde bir kere veri atildiginda bir daha degistiremeyecegimiz yapilardir
// val ismi ile kull hafiza yonetimini rahatlatir cunku bellekte sabit alan ayrilir.

fun main(){
    var sayi=10

    sayi =20
    sayi =30

    println(sayi)

    val sayi2=100

    //sayi2 =50 burada hata verir cunku val degerler degistirilmez.
}