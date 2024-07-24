package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B3_24_Donguler

fun main(){

    // 3 ile 6
    for (i in 3..6){
        println(i)
    }

    var sayac=3
    while (sayac<7){
        println(sayac)
        sayac+=1
    }
    println("---------------")
    // 0 ile 8 2ser

    for (i in 2..8 step 2){
        println(i)
    }

    var sayac2=0
    while (sayac2<9){
        println(sayac2)
        sayac2+=2
    }
    println("---------------")
    // 8 den 0 2ser azalarak

    for (i in 8 downTo 0 step 2){
        println(i)
    }

    var sayac3=8
    while (sayac3>=0){
        println(sayac3)
        sayac3-=2
    }

}