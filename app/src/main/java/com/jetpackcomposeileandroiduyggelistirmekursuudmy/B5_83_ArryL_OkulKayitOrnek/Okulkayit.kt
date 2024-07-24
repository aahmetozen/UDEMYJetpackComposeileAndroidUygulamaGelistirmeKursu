package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B5_83_ArryL_OkulKayitOrnek

import java.util.Scanner

fun main(){
    val scanner=Scanner(System.`in`)
    val ogrenciler=ArrayList<Ogrenci>()
    var sayac=1

    while (true){
        println("ogrenci adi giriniz:")
        val ad=scanner.next()
        println("ogrenci sinifi giriniz:")
        val sinif=scanner.next()

        val yeniogrenci=Ogrenci(sayac,ad,sinif)
        sayac+=1
        ogrenciler.add(yeniogrenci)

        println("cikmak icin (1) devam etmek icin diger sayilar")
        val cikis=scanner.nextInt()
        if (cikis==1){
            for (ogrenci in ogrenciler){
                println("************")
                println("ogrenci no:${ogrenci.no}")
                println("ogrenci ad:${ogrenci.ad}")
                println("ogrenci sinif:${ogrenci.sinif}")
                println("************")
            }
            println("cikis yapildi")
            break
        }
    }
}