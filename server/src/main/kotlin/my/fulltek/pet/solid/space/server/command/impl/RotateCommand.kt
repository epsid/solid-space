package my.fulltek.pet.solid.space.server.command.impl

import my.fulltek.pet.solid.space.server.command.Command
import my.fulltek.pet.solid.space.server.`object`.Rotatable

class RotateCommand(private val rotatable: Rotatable): Command {
    //todo how to set vector angle?
    override fun execute() {
        rotatable.setAngle(rotatable.getAngle())
    }
}