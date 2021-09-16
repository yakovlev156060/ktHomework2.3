fun main(){
    val previous =100000//предыдущие покупки в рублях
    var purchase:Float = 1000F//текущая покупка в рублях
    val regularCustomer:Boolean=true
    var remainder:Float//сумма на оплату после скидки в рублях

    if (previous<1000){
        remainder=purchase
    }
    else{
        if(previous<10000){
            remainder=purchase-100F
        }
        else{
            remainder=purchase*0.95F
        }
    }

    if(regularCustomer){
        remainder*=0.99F
    }

    var rezultRuble:Int=0
    var rezultPenny:Int=0
    remainder*=100
    val rezult:Int=remainder.toInt()
    rezultRuble=rezult/100
    rezultPenny=rezult-rezultRuble*100;

    println("Итоговая стоимость покупки $rezultRuble рублей $rezultPenny копеек")
}