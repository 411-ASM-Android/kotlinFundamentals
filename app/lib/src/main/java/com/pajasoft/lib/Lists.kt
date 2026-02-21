package com.pajasoft.lib

fun main() {

    fun main() {
        // <T> es para tipos genericos
        //val number = listOf<Int>() //Declarar una lista basia
        val numbers = listOf(32,312,42,321,32,21,4,5) //Declarar una lista no basia
        val dynamicNumbers = mutableListOf(2,3,123,12)
        dynamicNumbers.add(23)
        var maxNumber = numbers [0]
        for (number in numbers){
            if (number > maxNumber){
                maxNumber = number
            }
            println(number)
        }

    }
}