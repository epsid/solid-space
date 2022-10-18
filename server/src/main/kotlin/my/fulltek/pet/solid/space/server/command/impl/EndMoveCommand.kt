package my.fulltek.pet.solid.space.server.command.impl

import my.fulltek.pet.solid.space.server.command.Command
import my.fulltek.pet.solid.space.server.command.MoveCommandEndable
import java.util.Queue

class EndMoveCommand(
    private val queue: Queue<Command>,
    private val moveCommand: MoveCommand
) : MoveCommandEndable<Command>, Command {

    override fun getMovableCommand(): MoveCommand {
        return moveCommand
    }

    override fun getQueue(): Queue<Command> {
        return queue
    }

    override fun execute() {
        val endCommand = BridgeCommand(moveCommand)
        endCommand.inject(NopCommand())
        queue.add(endCommand)
    }
}