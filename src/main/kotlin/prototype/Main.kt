package main.kotlin.prototype

    fun main(){
        var particle = Particle(2.3, arrayOf(3.3,3.7,4.8))
        System.out.println(particle)
        System.out.println(particle.clone())
    }
