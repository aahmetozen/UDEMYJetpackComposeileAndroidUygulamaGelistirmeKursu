package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B4_68_OrnekInterface

fun main(){
    val aslan=Aslan()
    val amasyaElmasi:Elma=AmasyaElmasi()
    val elma=Elma()
    val tavuk:Eatable=Tavuk()

    val nesneler= arrayOf(aslan,amasyaElmasi,elma,tavuk)

    for (nesne in nesneler){
        if (nesne is Eatable){
            nesne.howtoeat()
        }
        if (nesne is Squeezable){
            nesne.howtosqueeze()
        }
    }
}