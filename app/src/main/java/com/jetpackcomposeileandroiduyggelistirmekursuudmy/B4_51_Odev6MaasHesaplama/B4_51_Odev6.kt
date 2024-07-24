package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B4_51_Odev6MaasHesaplama

/*6.parametre olarak girilen gun sayisina gore maas hesabi yapan ve elde edilen degeri geri
 * donduren metot yaziniz(1 gunde 8 saat calisilabilir,calisma saat ucreti 10tl,
 * mesai saat ucreti 20tl, 160 saat uzeri mesai sayilir) */

fun main(){
    fun maashesabi(gun:Int):String{
        if (gun<=20){
            var calismaSaat:Int=gun*8
            var calismaUcret:Int=calismaSaat*10
            return "Bu ay calisma saatiniz:$calismaSaat ve maasiniz:$calismaUcret"
        }else if (gun>20 && gun<31){
            var mesaiSaat:Int=(gun-20)*8
            var mesaiUcret:Int=(mesaiSaat*20)+1600
            return "Bu ay calisma saatiniz:${gun*8} ve maasiniz:$mesaiUcret"
        }else{
            return "hatali gun girdiniz"
        }
    }
    println(maashesabi(21))
}