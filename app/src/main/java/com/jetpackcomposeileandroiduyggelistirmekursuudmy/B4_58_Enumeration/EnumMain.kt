package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B4_58_Enumeration

// parametreklerde kullanilir. Verinin eslesmesi sonucu islem yapilir.
// Yazilimciyi detaydan kurtarir

fun main(){
    fun ucretal(boyut: KonserveBoyut){
        when(boyut){
            KonserveBoyut.kucuk -> println(20*30)
            KonserveBoyut.orta -> println(30*30)
            KonserveBoyut.buyuk -> println(40*30)
        }
    }
    ucretal(KonserveBoyut.orta)
}