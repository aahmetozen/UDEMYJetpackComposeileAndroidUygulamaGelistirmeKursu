package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B4_52_Odev7InternetUcretiHesaplama

/* 7.parametre olarak girilen kota miktarina gore ucreti hesaplayarak geri donduren
* metodu yazin(50 gb 100 tl, asimdan sonraki her 1 gb 4tl)*/

fun main(){
    fun kotahesapla(kull:Int):String{
        println("50GB kota asiminizdan sonraki her 1GB 4TL`dir")
        if (kull<=50){
           return "kotanizi asmadiniz 50GB internet paketiniz 100TL"
        }else if (kull>50){
            var asim:Int=kull-50
            return "kotanizi${asim}GB asdiniz ucretiniz:${(asim*4)+100}TL"
        }else
            return "hatali giris"
    }
    println(kotahesapla(65))
}