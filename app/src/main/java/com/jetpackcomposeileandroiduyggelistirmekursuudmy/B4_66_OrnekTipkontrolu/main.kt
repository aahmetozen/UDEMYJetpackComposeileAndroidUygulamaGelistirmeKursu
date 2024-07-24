package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B4_66_OrnekTipkontrolu

fun main(){
    val ogretmen:Personel=Ogretmen()
    val isci:Personel=Isci()

    val mudur=Mudur()

    mudur.terfiettir(ogretmen)
    mudur.iseal(ogretmen)
    mudur.iseal(isci)
}