package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B4_40_Fonksiyonlar

/* FONKSIYONLAR(METOTLAR)
*  1.geri donus degeri olan / 2. geri donus degeri olmayan */

fun main(){
    // geri donus degeri olmayan
    fun selamla(){
        val sonuc="merhaba ahmet"
        println(sonuc)
    }
    selamla()
    println("-------------")
    // geri donus degeri olan
    fun selamla2():String{
        val sonuc="merhaba ahmet"
        return sonuc
    }
    val gelensonuc=selamla2()
    println(gelensonuc)
    println("-------------")

    fun selamla3(isim:String):String{
        val sonuc="merhaba $isim"
        return sonuc
    }
    val gelens=selamla3("ahmet")
    println(gelens)
    println("-------------")

    fun toplama(){
        val toplam=30 + 40
        println("toplam=$toplam")
    }
    toplama()
    println("-------------")

    fun toplama2():Int{
        val toplam=30 + 80
        return toplam
    }
    val t1=toplama2()
    println("toplam=$t1")
    println("-------------")

    fun toplama3(s1:Int,s2:Int):Int{
        val toplam=s1+s2
        return toplam
    }
    val t3=toplama3(5,15)
    println("toplam=$t3")
}
