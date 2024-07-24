package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B4_66_OrnekTipkontrolu

class Mudur:Personel() {
    fun iseal(p:Personel){ // personel sinifindan turemis nesne gonder demis olduk
        p.isealindi()
    }
    fun terfiettir(p:Personel){

        (p as Ogretmen).maasattir() //(p as Ogretmen) downcasting yanni ust sinifi alt sinifa donusturduk
    }
}