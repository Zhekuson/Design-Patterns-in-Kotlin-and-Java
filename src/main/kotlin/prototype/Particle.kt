package main.kotlin.prototype

import kotlin.random.Random

class Particle(private var mass:Double, private var vectorSpeed:Array<Double>):Prototype{
    private var charge:Double =  mass - Random.nextDouble()
    fun getBuff():Double{
        return charge*mass
    }
    override fun clone(): Prototype {
        val particle = Particle(mass, vectorSpeed)
        particle.charge = this.charge
        return particle
    }

    override fun toString(): String {
        return "Mass ${mass} Charge${charge}"
    }
}