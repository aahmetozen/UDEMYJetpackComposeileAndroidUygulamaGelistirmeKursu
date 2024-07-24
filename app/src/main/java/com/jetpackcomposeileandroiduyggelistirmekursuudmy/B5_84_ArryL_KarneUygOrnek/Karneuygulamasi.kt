package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B5_84_ArryL_KarneUygOrnek

import java.util.Scanner

fun main(){
    val scanner=Scanner(System.`in`)
    val dersnotlarilistesi=ArrayList<DersNotlar>()

    while (true){
        println("ders adini giriniz")
        val ders=scanner.next()

        println("ders notunu giriniz")
        val not=scanner.nextInt()

        val yeninot=DersNotlar(ders,not)
        dersnotlarilistesi.add(yeninot)
        println("Cikmak icin (1) devam etmek icin diger sayilar")
        val cikis=scanner.nextInt()
        if (cikis==1){
            println("***********************")
            var toplam=0
            for (dn in dersnotlarilistesi){
                println("${dn.ders} : ${dn.not}")
                toplam=toplam+dn.not
            }
            val  ortalama=toplam/dersnotlarilistesi.size
            println("***********************")
            println("ortalama:$ortalama")
            if (ortalama>=50){
                println("gectiniz")
            }else{
                println("kaldiniz")
            }
            println("cikis yapildi")
            break
        }
    }
}