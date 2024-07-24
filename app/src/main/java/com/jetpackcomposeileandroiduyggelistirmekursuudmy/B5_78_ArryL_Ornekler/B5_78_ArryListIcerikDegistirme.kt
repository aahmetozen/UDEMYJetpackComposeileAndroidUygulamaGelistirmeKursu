package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B5_78_ArryL_Ornekler

fun main(){
    val sayilar=ArrayList<Int>()

    sayilar.add(1)
    sayilar.add(2)
    sayilar.add(3)
    sayilar.add(4)
    sayilar.add(5) // [1,2,3,4,5] halinden  - [2,4,6,8,10] haline getirmek istiyorum

    for ((indeks,sayi)in sayilar.withIndex()){
        val sonuc=sayi*2
        sayilar[indeks]=sonuc
    }
    for (s in sayilar){
        println(s)
    }

}