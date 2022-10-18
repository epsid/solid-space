package my.fulltek.pet.solid.space.server.command

interface ChangeSpeedCommand : Command {
    fun setSpeed(newValue: Int)
}