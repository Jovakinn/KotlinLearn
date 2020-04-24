package com.jovakinn

class User(var firstName: String = "Peter" ,
           var secondName: String = "Parker"){
    var login: String? = null
        set(value) {
            if (value == "Codeee")
                field = "None"
            else
                field = value
            println("Variable: $field")
        }
        get(){
            val loginField = field ?: "undefined"
            println("Variable equals: $loginField")
            return field
        }

    fun printUser(){
        println("$firstName $secondName")
    }
}