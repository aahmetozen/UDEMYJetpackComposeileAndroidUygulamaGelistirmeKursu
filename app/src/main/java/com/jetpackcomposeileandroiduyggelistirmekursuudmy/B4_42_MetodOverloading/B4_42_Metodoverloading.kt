package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B4_42_MetodOverloading

/* mettotlarin ayni isimle tekrar kullanilmasi. Tek sart metodun parametre diziliminde
*  turlerin farkli olmasidir. metodlarin kullaniminda parametre cesitliligi saglar*/

fun main(){
    val h=Hesaplayici()
    h.topla(2,6)
    h.topla(3.0,4)
    h.topla(3,5.0)
    h.topla(1,2,"ahmet")
}