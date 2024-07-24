package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B4_41_FonksiyonlaraSinificindeErisim

class Matematik {
    fun topla(s1:Int,s2:Int){
        val topl=s1+s2
        println("toplam sonucu:$topl")
    }
    fun cikar(s1:Double,s2:Double):Double{
        return s1-s2
    }
    fun carp(s1:Int,s2:Int,isim:String){
        val topl=s1+s2
        println("carpma sonucu:$topl,$isim tarafindan")
    }
    fun bol(s1:Double,s2:Double):String{
        return "bolme: ${s1/s2}"
    }
}