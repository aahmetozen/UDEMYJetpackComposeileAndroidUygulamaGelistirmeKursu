package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B4_55_VisibiltyModifier

class B : A() { // b sinifi a sinifndan kalitim aliyor(artik protected degiskene erisebilirz)
    fun fonksiyon(){

        println(publicdegisken2)
        println(varsayilandegisken)
        //println(privatedegisken) // private sadece o siniftan erisilir
        println(protecteddegisken)
    }
}