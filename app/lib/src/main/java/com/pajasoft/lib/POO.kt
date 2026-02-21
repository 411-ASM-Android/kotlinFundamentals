package com.pajasoft.lib

//Principios POO
//A PIE
//Herencia
//Polimorfismo
//Encapsulamiento
//Abstraccion

class Person(val name : String, val age :Int){

    fun sayHello(){
        println("Hola soy $name y tengo $age")
    }
}

//ABSTRACCION
//Modelas SOLO LO IMPORTANTE
//an abstract class cannot instance an object

abstract class Shape{
    abstract fun calculateArea() : Double
}
class Circle (val radius : Double) : Shape(){
    override fun calculateArea(): Double {
        return radius * radius * Math.PI
    }

}

class Square(val side: Double) : Shape(){
    override fun calculateArea(): Double {
        return side * side
    }

}
interface Ave{
    fun fly()
    fun poop()
    fun peep ()
    fun coito()
}
//final no se puede heredar
final class Eagle : Ave{
    override fun fly() {
    }

    override fun poop() {
    }

    override fun peep() {
    }

    override fun coito() {
    }

}

open class Animal(val name: String){
    open fun makeSound(){
        println("$name esta haciendo un sonido")
    }
}
class Dog : Animal(name = "Bonnie"){

}
class Cat (val catName: String) : Animal(name = catName){
    fun trepar(stairs:Int,place:String){
        println("$name trepo $stairs escalones en $place")
    }
}

fun main (){
    val persona = Person("Juan",17)
    val persona2 = Person ( age=29 ,name = "Juan Frausto")
    val animal = Animal("Animal Generico")
    val cat = Cat("Coco")
    cat.trepar(3,"La salle")
    persona.sayHello()
    persona2.sayHello()
    println("El nombre de la persona 1 es ${persona.name}")

    val square1 = Square(34.5)
    val square2 = Square(12.3)
    val circle = Circle (10.0)
    val shapes = listOf<Shape>(square1,square2,circle)
    for(shape in shapes){
        println(shape.calculateArea())
    }
}