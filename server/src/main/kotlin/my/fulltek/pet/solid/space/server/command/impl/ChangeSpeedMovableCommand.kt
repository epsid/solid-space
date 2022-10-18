package my.fulltek.pet.solid.space.server.command.impl

import my.fulltek.pet.solid.space.server.command.ChangeSpeedCommand
import my.fulltek.pet.solid.space.server.`object`.SpeedChangeable
import my.fulltek.pet.solid.space.server.utils.VectorUtils

class ChangeSpeedMovableCommand(private val speed: Int, private val speedChangeable: SpeedChangeable) : ChangeSpeedCommand {

    override fun setSpeed(newValue: Int) {
        val velocity = speedChangeable.getVelocity()
        speedChangeable.setVelocity(VectorUtils.getVelocityFromSpeed(velocity, speed))
    }

    override fun execute() {
        setSpeed(speed)
    }
}