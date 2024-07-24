package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B3_24_Donguler

/* Break:islemi bitirir
*  Continue:islemi pas gecer */

fun main(){
    for (i in 1..5){
        if (i==3){
            break
        }
        println("Dongu 1:$i")
    }
    for (i in 1..5){
        if (i==3){
            println("3 atlandi")
            continue
        }
        println("Dongu 2:$i")
    }
}