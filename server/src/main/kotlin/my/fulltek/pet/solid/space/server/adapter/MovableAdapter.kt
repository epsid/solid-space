package my.fulltek.pet.solid.space.server.adapter

import my.fulltek.pet.solid.space.server.`object`.Movable
import my.fulltek.pet.solid.space.server.`object`.UObject
import my.fulltek.pet.solid.space.server.data.Vector

open class MovableAdapter(private val uObject: UObject) : Movable {
    override fun getPosition(): Vector {
        return uObject.getProperty("position") as Vector
    }

    override fun getVelocity(): Vector {
        return uObject.getProperty("velocity") as Vector
    }

    override fun setPosition(newValue: Vector) {
        uObject.setProperty("position", newValue)
    }
}