package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B3_21_WhenCalismasi

import java.util.Scanner

/* kullanicidan alinan secime gore dort islem yapan program */
fun main(){
    val girdi=Scanner(System.`in`)
    print("Toplama(1)\n Cikarma(2) \n Carpma(3) \n Bolme(4)")
    val tercih=girdi.nextInt()
    println("birinci sayiyi giriniz:")
    val sayi1=girdi.nextInt()
    println("ikinci sayiyi giriniz:")
    val sayi2=girdi.nextInt()
    when(tercih){
        1 -> println("Toplama sonucu:${sayi1+sayi2}")
        2 -> println("Cikarma sonucu:${sayi1-sayi2}")
        3 -> println("Carpma sonucu:${sayi1*sayi2}")
        4 -> println("Bolme sonucu:${sayi1/sayi2}")
        else -> println("Boyle bir islem yok!")
    }
    /* 23.video "toolbar menu" baska bir when ornegi ve menulerde kullaniminin
    * konu anlatimi */
}