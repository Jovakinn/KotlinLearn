package com.jovakinn

interface UserInfoProvider{

    val info: String

    fun printInfo(user: User) {
        println(info)
        user.printUser()
    }
}

interface DbConnection {
    fun getConnection(): String
}

class MainProvider : UserInfoProvider, DbConnection{

    override val info: String
        get() = "Method was called"

    override fun printInfo(user: User) {
        super.printInfo(user)
        println("additional code")
    }

    override fun getConnection(): String {
        return "DB connected"
    }
}