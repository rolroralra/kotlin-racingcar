package step3.domain.car

import step3.domain.car.distance.CarDistance
import step3.domain.car.distance.DefaultCarDistance

class RacingCar(
    private val carDistance: CarDistance<Int> = DefaultCarDistance()
) : CarDistance<Int> by carDistance {

    init {
        // require(isValidName(name)) { "name must be a valid name [$name]" }
    }

    fun go() {
        increment(1)
    }

    override fun toString(): String = "${this.javaClass.simpleName}(distance=$distance)"
}
