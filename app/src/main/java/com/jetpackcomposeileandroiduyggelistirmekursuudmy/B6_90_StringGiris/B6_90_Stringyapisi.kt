package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B6_90_StringGiris

fun main(){
    val str1="merhaba"
    println(str1)

    var str2=String()
    str2 ="kotlin"
    println(str2)

    val str3= """
        NASILSIN
        MERHABA
        HEY
    """.trimIndent()
    println(str3)

    val str4=""
    val str5=String()
    if (str4.isEmpty()){
        println("str4 bos")
    }else{
        println("str4 dolu")
    }
    if (str5.isEmpty()){
        println("str5 bos")
    }else{
        println("str5 dolu")
    }
    // string icinde islem yapilabilir degisken atanabilir
    val a=10
    val b=20
    println("$a x $b = ${a*b}")

    val str6="merhaba"
    val str7=" Dunya"
    println(str6+str7)

    val str8="merhaba kotlin !"
    println("$str8 boyutu: ${str8.length}")

    // string ifadeler karsilastirilabilir
    val str9="merhaba"
    val str10="merhaba dunya"

    if (str9 == str10){
        println("$str9 ve $str10 esittir")
    }else{
        println("$str9 ve $str10 esit degildir")
    }
    val str11="kotlin" // veri kumesi gibi davranir
    for (h in str11){
        println(h)
    }
}