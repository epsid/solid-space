package my.fulltek.pet.solid.space.server.command.impl

import my.fulltek.pet.solid.space.server.`object`.Movable
import my.fulltek.pet.solid.space.server.command.Command
import my.fulltek.pet.solid.space.server.data.Vector

class MoveCommand(private val movable: Movable) : Command {
    override fun execute() {
        val newPosition = Vector.plus(movable.getPosition(), movable.getVelocity())
        movable.setPosition(newPosition)
    }
}