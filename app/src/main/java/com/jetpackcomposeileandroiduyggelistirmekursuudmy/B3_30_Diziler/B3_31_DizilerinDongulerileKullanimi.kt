package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B3_30_Diziler

fun main(){
    val meyveler = arrayOf<String>("cilek","muz","elma","kivi","kiraz")
    for (meyve in meyveler){
        println("Sonuc$meyve")
    }
    println("-----------------------")

    for ((indeks,meyve)in meyveler.withIndex()){
        println("Sonuc$indeks : $meyve")
    }

}