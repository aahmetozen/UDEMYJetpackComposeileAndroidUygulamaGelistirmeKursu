package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B3_24_Donguler

import java.util.Scanner

// konsoldan girilen adinizi konsoldan girilen sayi kadar tekrar yazdiran program
fun main(){
    val scanner=Scanner(System.`in`)
    println("adinizi giriniz:")
    val ad=scanner.nextLine()
    println("kac kez tekrarlansin:")
    var tekrar=scanner.nextInt()

    for (i in 1 .. tekrar){
        println("$i.$ad")
    }
    println("----------------")

    while (tekrar >0){
        println(ad)
        tekrar-=1
    }
}