package my.fulltek.pet.solid.space.server.adapter

import my.fulltek.pet.solid.space.server.`object`.UObject
//todo вынести в интерфейс object, action?
class MovingCommandAdapter(private val movingCommand: UObject) {
    fun getObjectId() : Long {
        return movingCommand.getProperty("id") as Long
    }

    fun getAction() : String {
        return movingCommand.getProperty("action") as String
    }

    fun getSpeed() : Int {
        return movingCommand.getProperty("speed") as Int
    }
}

