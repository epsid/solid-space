package my.fulltek.pet.solid.space.server.adapter

import my.fulltek.pet.solid.space.server.data.Vector
import my.fulltek.pet.solid.space.server.`object`.SpeedChangeable
import my.fulltek.pet.solid.space.server.`object`.UObject

class SpeedChangeableAdapter(private val movingObject: UObject) : MovableAdapter(movingObject), SpeedChangeable {
    override fun setVelocity(newValue: Vector) {
        movingObject.setProperty("velocity", newValue)
    }
}