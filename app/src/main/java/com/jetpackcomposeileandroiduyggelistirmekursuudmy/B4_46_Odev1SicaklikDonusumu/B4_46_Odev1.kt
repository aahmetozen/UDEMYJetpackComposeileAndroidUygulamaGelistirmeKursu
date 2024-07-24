package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B4_46_Odev1SicaklikDonusumu

/* 1.parametre olarak girilen dereceyi fahrenhiet`e(Tf=Tc*1.8+32) donusturen
    sonra geri donduren metot yazin */

fun main(){
    fun sicaklikD(C:Int):Double{
        var F=(C*1.8+32)
        return F
    }
    println(sicaklikD(10))
}