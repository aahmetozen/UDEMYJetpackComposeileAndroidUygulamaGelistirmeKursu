package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B5_78_ArryL_Ornekler

fun main(){
    val sayilar=ArrayList<Int>()

    sayilar.add(30)
    sayilar.add(40)
    sayilar.add(50)
    sayilar.add(70)
    sayilar.add(100)
    sayilar.add(60)

    var toplam=0
    for (s in sayilar){
        toplam+=s
    }

    println("ortalama:${toplam/sayilar.size}")
}