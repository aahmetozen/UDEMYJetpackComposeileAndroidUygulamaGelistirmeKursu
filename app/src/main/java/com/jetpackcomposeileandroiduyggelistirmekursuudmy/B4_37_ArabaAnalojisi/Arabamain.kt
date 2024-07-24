package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B4_37_ArabaAnalojisi

fun main(){
    val bmw=Araba()
    println("araba sinifindan nesne olsturuldu")
    bmw.renk="Beyaz"
    bmw.calisiyormu=true
    println(bmw.renk)
    println(bmw.calisiyormu)
    println(bmw.hiz)
    println("----------------")

    val BMW=ArabaCons("kirmizi",100,false)
    println("Arabacons sinifindan nesne olusturuldu")

    println(BMW.hiz)
    BMW.hiz=199
    println(BMW.hiz)
    println(BMW.renk)
    println(BMW.calisiyormu)
    println("----------------")
    BMW.Bilgial()
    println("----------------")
    BMW.durdur()
    BMW.Bilgial()
    println("----------------")
    BMW.hizlan(31)
    println(BMW.hiz)
    BMW.yavasla(45)
    println(BMW.hiz)


}