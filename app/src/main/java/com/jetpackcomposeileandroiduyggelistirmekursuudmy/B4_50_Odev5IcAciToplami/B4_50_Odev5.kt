package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B4_50_Odev5IcAciToplami

/*5.parametre olarak girilen kenar sayisina gore ic acilar toplamini hesaplayip sonucu
 * geri gonderen metod yaziniz(Formul:(n-2).180) n=kenar sayisi */

fun main(){
    fun icacitopl(ks:Int):Int{
        return (ks-2)*180
    }

    println(icacitopl(4))
}