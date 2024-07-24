package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B3_24_Donguler

import java.util.Scanner

// konsoldan girilen islenecek veri sayisini isleyerek ekrana yazdiriniz

fun main(){
    val scanner=Scanner(System.`in`)
    println("islencek veri miktarini giriniz")
    var veri=scanner.nextInt()

    while (veri>0){
        println("$veri. veri")
        veri-=1
    }

}