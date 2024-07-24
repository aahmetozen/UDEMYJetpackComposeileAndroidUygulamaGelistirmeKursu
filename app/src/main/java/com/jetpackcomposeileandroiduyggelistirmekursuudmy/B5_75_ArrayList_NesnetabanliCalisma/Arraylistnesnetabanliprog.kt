package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B5_75_ArrayList_NesnetabanliCalisma

fun main(){
    val u1=Urun(1,"saat",150.0)
    val u2=Urun(2,"TV",1750.0)
    val u3=Urun(3,"PC",960.0)

    val urunler=ArrayList<Urun>()  // urun sinifindan olusan nesneler olcagindan
                                    // urun tipinde nesneler tutacak

    urunler.add(u1)
    urunler.add(u2)
    urunler.add(u3)

    for (urun in urunler){
        println("****************")
        println("urun no:${urun.urunno},urun ad:${urun.urunad},urun fiyat:${urun.urunfiyat}")
    }

}