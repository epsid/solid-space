package my.fulltek.pet.solid.space.server.command.impl

import my.fulltek.pet.solid.space.server.command.Command
import my.fulltek.pet.solid.space.server.command.InjectableCommand

class BridgeCommand(private var internalCommand: Command) : InjectableCommand {

    override fun inject(other: Command) {
        internalCommand = other
    }

    override fun execute() {
        internalCommand.execute()
    }

}