package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B4_37_ArabaAnalojisi

class ArabaCons(var renk:String, var hiz:Int, var calisiyormu:Boolean) {
    fun Bilgial(){
        println("Renk:$renk")
        println("Hiz:$hiz")
        println("Calisiyor mu:$calisiyormu")
    }
    fun calistir(){
        calisiyormu=true
    }
    fun durdur(){
        calisiyormu=false
    }
    fun hizlan(Kackm:Int){
        hiz= hiz+Kackm
    }
    fun yavasla(frn:Int){
        hiz= hiz-frn
    }
}