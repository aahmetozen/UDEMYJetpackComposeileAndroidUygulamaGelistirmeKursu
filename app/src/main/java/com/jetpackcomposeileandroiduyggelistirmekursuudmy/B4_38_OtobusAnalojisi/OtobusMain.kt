package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B4_38_OtobusAnalojisi

fun main(){
    val kamilkoc=Otobus(50,"Bursa","Ankara",10)

    println(kamilkoc.nereden)
    println(kamilkoc.nereye)
    println(kamilkoc.kapasite)
    println(kamilkoc.yolcusay)
    println("-----------------------")
    kamilkoc.nereden="Samsun"
    kamilkoc.yolcusay=3

    println(kamilkoc.nereden)
    println(kamilkoc.nereye)
    println(kamilkoc.kapasite)
    println(kamilkoc.yolcusay)
    println("-----------------------")

    kamilkoc.yolcual(4)
    kamilkoc.yolcuindir(1)

    kamilkoc.bilgial()

    val tokatseyahat=Otobus(30,"Kayseri","Ankara",13)

    tokatseyahat.bilgial()

    
}