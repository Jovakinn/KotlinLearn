package com.jovakinn

fun main(args: Array<String>){

    val user = MainProvider()
//    user.printInfo(User())
//    println(user.getConnection())

    checkDataTypes(user)

}

fun checkDataTypes(obj: MainProvider){
    if (obj is UserInfoProvider){
        obj.printInfo(User())
    }
    else if (obj is DbConnection){
        println(obj.getConnection())
    }
}