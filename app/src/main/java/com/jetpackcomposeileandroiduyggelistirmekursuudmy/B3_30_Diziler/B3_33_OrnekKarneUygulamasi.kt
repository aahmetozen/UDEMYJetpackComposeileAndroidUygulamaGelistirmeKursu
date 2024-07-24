package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B3_30_Diziler

import java.util.Scanner

/* 5 adet dersin adi ve notu girilecek. Karne seklinde cikti alinacak, ortalama
*  hesaplanip eger 50 ustundeyse gecti degilse kaldi yazacak */

fun main(){
    var Ddizi= Array<String>(size=5){""}
    var Ndizi= Array<Int>(size=5){0}
    var scanner=Scanner(System.`in`)
    for(i in 0 until Ddizi.count()){
        print("${i+1}.dersi giriniz")
        val ders=scanner.next()
        Ddizi[i]=ders


        print("${i+1}.dersin notunu girin")
        val not=scanner.nextInt()
        Ndizi[i]=not

    }
    println("Dersler=${Ddizi.contentToString()}")
    println("Notlar=${Ndizi.contentToString()}")

    for (i in 0 until Ddizi.count()){
        println("${i+1}.${Ddizi[i]}=${Ndizi[i]}")
    }
    var toplam=0
    for (i in 0 until Ndizi.count()){
        toplam= toplam + Ndizi[i]
        println(toplam)
    }
    val ort=toplam/Ndizi.count()

    if (ort>=50){
        println("ortalamaniz:$ort,gectiniz")
    }else{
        println("ortalamaniz:$ort,kaldiniz")
    }
}