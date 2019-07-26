class Hippo: Animal() {
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise() = println("Grunt! Grunt!")

    override fun eat() = println("The Hippo is eating $food")

    override fun roam() = println("The Hippo is roaming")
}
