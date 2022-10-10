package my.fulltek.pet.solid.space.server

class Rotate(private val rotatable: Rotatable) {
    fun execute() {
        rotatable.setAngle(rotatable.getAngle())
    }
}