package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B5_78_ArryL_Ornekler

fun main(){
    val sayilar=ArrayList<Int>()
    sayilar.add(1)
    sayilar.add(23)
    sayilar.add(32)
    sayilar.add(47)
    sayilar.add(59)
    sayilar.add(100)
    sayilar.add(18)
    sayilar.add(54)

    val tekler=ArrayList<Int>()
    val ciftler=ArrayList<Int>()

    for (s in sayilar){
        if (s%2==0){
            ciftler.add(s)
        }

        if (s%2==1){
            tekler.add(s)
        }
    }
    println("tek sayilar")
    for (s in tekler){
        println(s)
    }
    println("cift sayilar")
    for (s in ciftler){
        println(s)
    }
}