package my.fulltek.pet.solid.space.server.command

interface InjectableCommand: Command {
    fun inject(other: Command)
}