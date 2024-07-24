package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B5_78_ArryL_Ornekler

import kotlin.random.Random

fun main(){
    val sayilar=ArrayList<Int>()

    for (i in 1..100){
        val rastglesayi= Random.nextInt(0,101)
        sayilar.add(rastglesayi)
    }
    sayilar.sort()
    for (s in sayilar){
        println(s)
    }
}