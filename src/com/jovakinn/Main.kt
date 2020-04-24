package com.jovakinn

enum class Animals{
    DOG, CAT, LION, BEAR;

    fun toLowerCase () = name.toLowerCase().capitalize()
}

fun main(args: Array<String>){

//    val user = NewClass()
//    user.printInfo(User())
//    println(user.getConnection())

    val user = object : MainProvider(){
        override fun printInfo(user: User) {
            super.printInfo(user)
            println("output text")
        }
    }

    checkDataTypes(user)

    val animal = Animals.CAT

    when (animal){
        Animals.CAT -> println(animal.toLowerCase())
        Animals.LION -> println(animal.toLowerCase())
        else -> println("Something else")
    }

}

fun checkDataTypes(obj: MainProvider){
    if (obj is UserInfoProvider){
        obj.printInfo(User())
    }
    else if (obj is DbConnection){
        println(obj.getConnection())
    }
}

