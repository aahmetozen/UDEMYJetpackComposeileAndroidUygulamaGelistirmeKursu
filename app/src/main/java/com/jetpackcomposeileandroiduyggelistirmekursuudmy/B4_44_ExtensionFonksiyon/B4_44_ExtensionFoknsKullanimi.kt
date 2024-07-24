package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B4_44_ExtensionFonksiyon

fun main(){
    fun Int.carpi2(sayi:Int):Int{
        return this*sayi
    }
    val sonuc2=5.carpi2(2)
    println(sonuc2)
    println("--------------------")
    // infix ile seklinde yazbiliriz
    infix fun Int.carpi(sayi:Int):Int{
        return this*sayi
    }
    val sonuc=5 carpi 2
    println(sonuc)

}