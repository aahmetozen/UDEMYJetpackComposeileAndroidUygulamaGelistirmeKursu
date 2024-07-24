package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B4_48_Odev3FaktoriyelHesabi

/*3.parametre olarak girilen sayinin faktoriyel degerini hesaplayip geri donduren metot yazin */
fun main(){
    fun foktoriyelhesapla(sayi:Int):Int{
        var sonuc:Int=1
        for (i in 1..sayi){
            sonuc*=i

        }
        return sonuc
    }
    println(foktoriyelhesapla(3))

}