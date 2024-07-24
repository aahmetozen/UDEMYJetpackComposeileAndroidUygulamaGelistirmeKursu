package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B4_43_VarargParametresi

// vararg birden cok parametre almayi saglar
fun main(){
    fun toplam(vararg sayilar:Int):Int{ // burada sayilar degiskeni dizi gibi davranir.
        var sonuc=0
        for (s in sayilar){
            sonuc+=s

        }
        return sonuc
    }
    val t1=toplam(1,2,3,4,5)
    println("tpolam:$t1")
}