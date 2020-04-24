package com.jovakinn

sealed class Db{
    data class MySQL(val id: Int, val conn: String): Db()

    data class MongoDb(val id: Int, val conn: String): Db()
    data class PostgreSQL(val id: Int, val conn: String,
                          val isDone: Boolean): Db()

    object Help : Db() {
        val conn: String = "Connection done"
    }
}

val Db.MongoDb.info: String
    get() = "MongoDB has id: $id and connection: $conn"

fun Db.MongoDb.printInfo(){
    println(info)
}