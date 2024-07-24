package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B3_24_Donguler

import java.util.Scanner

/* Konsoldan girilen sayinin tek mi cift mi oldugunu bulan program (sonsuz dongu)*/

fun main(){
    var scanner= Scanner(System.`in`)
    while (true){
        println("sayi giriniz, cikmak istiyorsaniz 1`e basin:")
        var sayi=scanner.nextInt()
       if (sayi==1){
           println("cikis yapiliyor")
           break
       }else if (sayi%2==0){
           println("$sayi sayisi cift sayidir.")
       }else{
           println("$sayi sayisi tek sayidir")
       }
    }
}





