class Fox: Canine() {
    override val image = "fox.jpg"
    override val food = "berries"
    override val habitat = "grasslands"

    override fun makeNoise() = println("I don't know what the fox says...")

    override fun eat() = println("The fox is eating $food")
}