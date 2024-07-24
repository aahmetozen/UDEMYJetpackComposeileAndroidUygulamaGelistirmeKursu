package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B4_42_MetodOverloading

class Hesaplayici {
    fun topla(s1:Int,s2:Int){
        println("toplam:${s1+s2}")
    }
    fun topla(s1:Double,s2:Int){
        println("toplam:${s1+s2}")
    }
    fun topla(s1:Int,s2:Double){
        println("toplam:${s1+s2}")
    }
    fun topla(s1:Int,s2:Int,ad:String){
        println("toplam:${s1+s2}kisi:$ad")
    }
}