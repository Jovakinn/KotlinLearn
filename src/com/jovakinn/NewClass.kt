package com.jovakinn

class NewClass : MainProvider() {

    override val db: String
        get() = "Not connected"

    override val info: String
        get() = "New method"

    override fun printInfo(user: User) {
        super.printInfo(user)
        println("Text from heritage)")
    }
}