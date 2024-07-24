package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B5_78_ArryL_Ornekler

import java.util.Scanner

fun main(){
    val scanner=Scanner(System.`in`)

    val isimler=ArrayList<String>()

    isimler.add("ahmet")
    isimler.add("mehmet")
    isimler.add("zeynep")
    isimler.add("sedat")
    isimler.add("ercan")
    println("Aratmak icin isim giriniz")
    val isim=scanner.next()

    for (i in isimler){
        if (i==isim){
            println("isim mevcut")
            break
        }
    }
}