package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B4_60_OrnekComposition

fun main(){
    val k1=Kategoriler(1,"dram")
    val k2=Kategoriler(2,"komedi")

    val y1=Yonetmenler(1,"nuri bilge ceylan")
    val y2=Yonetmenler(2,"quentin tarantino")

    val f1=Filimler(1,"django",2013,k1,y2)

    println("filmid:${f1.filmid}")
    println("filmadi:${f1.filmad}")
    println("filmyil:${f1.filmyil}")
    println("filmkategori:${f1.kategori.kategoriad}")
    println("filmyonetmen:${f1.yonetmen.yonetmenadi}")
}