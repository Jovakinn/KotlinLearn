package com.jovakinn

class Some{
    companion object {
        var count: Int = 0
    }

    init {
        count++
        println("Created objects: $count")
    }
}
fun filterList(list: List<String>,
               filter: (String) -> (Boolean)) {
    list.forEach{el ->
        if (filter(el))
            println(el)
    }
}

val filter: (String) -> Boolean = {
    it.startsWith("P")
}

fun main(args: Array<String>){
    val list = listOf("Java", "PHP", "Python", "C++")
    filterList(list, filter)


    val db1 = Db.MongoDb(1, "mongo")
    val db2 = Db.PostgreSQL(1, "mongo", true)

    val db_copy = db1.copy(conn = "Done")

    if(db1 == db_copy)
        println("Equal")
    else
        println("Not equal")

    if (db_copy is Db.MongoDb){
        db_copy.printInfo()
    }

    val test = Some()
    val test2 = Some()
    val test3 = Some()
    val test4 = Some()
}
