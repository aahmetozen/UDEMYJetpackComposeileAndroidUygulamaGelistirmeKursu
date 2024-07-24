package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B2_13_TurDonusumu

/* 1.Sayisaldan sayisala donusum
*  2.Sayisaldan metine donusum
*  3.Metinden sayilsala donusum*/

fun main(){
    //Sayisaldan sayisala donusum
    var i:Int=42
    var d:Double=2.3
    var f:Float=42.89f

    var sonuc:Int=d.toInt()
    var sonuc2:Double=i.toDouble()
    var sonuc3:Int=f.toInt()
    println(sonuc)
    println(sonuc2)
    println(sonuc3)

    //Sayisaldan metine donusum

    var str1=i.toString()
    var str2=d.toString()
    var str3=f.toString()
    println(str1)
    println(str2)
    println(str3)

    //Metinden sayilsala donusum
    //Yontem1
    var yazi1="34"
    var yazi2="34 tr"


    try {
        var x=yazi1.toInt()
        println(x)
        var y=yazi2.toInt()
        println(y)

    }catch (e:Exception){
        println("Donusumde hata var!")
    }

    //Yontem2

    var yazi3="48.56"
    var z=yazi3.toDoubleOrNull()

    if (z != null){
        println("z:$z")
    }else{
        println("donusumde hata var")
    }

    //Yontem3

    var yazi4="67"

    var v = yazi4.toIntOrNull()

    v?.let {
        println("v:$v")
    }


}