package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B3_30_Diziler

import java.util.Scanner

/* 5 kisinin ismini konsoldan girerek diziye kaydedin ve girilen isimleri
*  ekranda gosterin */

fun main(){
    val scanner= Scanner(System.`in`)

    var Idizi= Array<String>(size=5){""}

    println("lutfen 5 isim giriniz")
    var sayac:Int=1
    while (sayac<6){
        println("$sayac.isimi giriniz:")
        var isim:String=scanner.nextLine()
        Idizi[sayac-1]=isim
        sayac+=1

    }
    println(Idizi.contentToString())
    for((indeks,isim)in Idizi.withIndex()){
        println("$indeks.isim=$isim")
    }
}