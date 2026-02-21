package com.pajasoft.lib
//1. Crea un programa que tenga un precio de comida y un porcentaje de comida
// e imprimir cuanto es el total a pagar
//Hilo:Espacio donde corre el programa
fun main() {
    println("Hola mundo")

    //1.

    val price: Double = 150.0
    val percentage: Double = 0.10
    val tip: Double = price * percentage
    val total: Double = price + tip
    println("El costo de la comida es: $$total")

    //2.El portero de la discoteca. Verifica que una persona pueda entrar en la disco
    //solo si es mayor de edad

   // println("Pon una edad")
    //val input = readlnOrNull()
    //val age = input?.toIntOrNull()
    //if (age == null) {
       // println("El número que pusiste no es un numero entero")
    //} else if (age > 18) {
      //  println("Eres mayor de edad puedes pasar")
    //} else {
      //  println("No puedes pasar pai")
    //}
    //RANGOS!!!!!!
    for(i in 1..10) {
        print(i)
    }
    1..10

     //Ciclo for al reves
    for(i in 10 downTo 2){
        println(i)
    }
    for(i in 100 downTo 0 step 10) {
        println(i)
    }

    var counter : Int = 12
    while (counter < 20){
        println("El contador es menor que 20")
        counter ++
    }
    do {
        println("El contador vale menos que 30")
        counter++
    }
        while(counter < 30)
    //Determinar si un numero ingresado por el usuario es un numero primo

        println("Pon un numero")
    val input = readlnOrNull()
    val numero = input?.toIntOrNull()
    //cambio interesante
}
