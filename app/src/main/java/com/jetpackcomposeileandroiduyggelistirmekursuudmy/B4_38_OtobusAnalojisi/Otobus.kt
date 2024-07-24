package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B4_38_OtobusAnalojisi

class Otobus(var kapasite:Int, var nereden:String, var nereye:String, var yolcusay:Int) {
    fun bilgial(){
        println("Kapasite:$kapasite")
        println("yolcu sayisi:$yolcusay")
        println("$nereden sehrinden $nereye sehrine")
    }
    fun yolcual(ylc:Int){
        yolcusay=yolcusay+ylc
    }
    fun yolcuindir(ylc:Int){
        yolcusay=yolcusay-ylc
    }
}