package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B4_49_HarfSayisiBulma

/*4.parametre olarak girilen kelime ve harf icin harfin kelime icinde kac adet oldugunu
 * gosteren metod yaziniz */

fun main(){
    fun harfbul(kelime:String?,harf:Char){
        var sayac:Int=0
        if (kelime != null) {
            for(i in kelime){
                if (i == harf){
                    sayac+=1
                    println("harf bulundu:$harf,$sayac kez")
                }
            }
        }
    }
    harfbul("ahmat",'a')
}