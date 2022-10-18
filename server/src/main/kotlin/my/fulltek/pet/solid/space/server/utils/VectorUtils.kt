package my.fulltek.pet.solid.space.server.utils

import my.fulltek.pet.solid.space.server.data.Vector
import kotlin.math.roundToInt
import kotlin.math.sqrt

class VectorUtils {
    //todo rounding error
    companion object {
        fun getSpeed(position: Vector, velocity: Vector): Int {
            val speed = sqrt((position.x * velocity.x + position.y * velocity.y).toDouble())
            return speed.roundToInt()
        }

        fun getVelocityFromSpeed(velocity: Vector, speed: Int): Vector {
            return Vector(velocity.x * speed, velocity.y * speed)
        }
    }
}