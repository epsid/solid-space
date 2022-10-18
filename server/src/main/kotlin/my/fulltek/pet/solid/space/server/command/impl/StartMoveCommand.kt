package my.fulltek.pet.solid.space.server.command.impl

import my.fulltek.pet.solid.space.server.`object`.UObject
import my.fulltek.pet.solid.space.server.adapter.MovingCommandAdapter
import my.fulltek.pet.solid.space.server.adapter.SpeedChangeableAdapter
import my.fulltek.pet.solid.space.server.command.Command
import my.fulltek.pet.solid.space.server.command.MoveCommandStartable
import my.fulltek.pet.solid.space.server.service.MovableService
import java.util.*

class StartMoveCommand(
    movingCommand: UObject, private val queue: Queue<Command>,
    private val movableService: MovableService
) :
    MoveCommandStartable<Command>, Command {

    private val movingCommandAdapter = MovingCommandAdapter(movingCommand)
    private val speedChangeableAdapter = SpeedChangeableAdapter(getMovingObject())

    override fun getMovingObject(): UObject {
        val id = movingCommandAdapter.getObjectId()
        return movableService.findById(id)
    }

    override fun getSpeed(): Int {
        return movingCommandAdapter.getSpeed()
    }

    override fun getQueue(): Queue<Command> {
        return queue
    }

    override fun execute() {
        val changeSpeedCommand = ChangeSpeedMovableCommand(getSpeed(), speedChangeableAdapter)
        val moveCommand = MoveCommand(speedChangeableAdapter)
        queue.add(changeSpeedCommand)
        queue.add(moveCommand)
    }
}
