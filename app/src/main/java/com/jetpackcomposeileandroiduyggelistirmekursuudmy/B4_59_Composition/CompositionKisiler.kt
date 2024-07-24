package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B4_59_Composition

fun main(){
    val adres=Adres("bursa","osmangazi")
    val kisi=Kisiler("ahmet",18,adres)

    println("Kisi ad:${kisi.ad}, yas:${kisi.yas}, kisi il:${kisi.adres.il}, kisi ilce:${kisi.adres.ilce}")
}