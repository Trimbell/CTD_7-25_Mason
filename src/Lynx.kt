class Lynx: Feline() {
    override val image = "lynx.jpg"
    override val food = "snowshoe hare"
    override val habitat = "forests"

    override fun makeNoise() = println("Growl!")

    override fun eat() = println("The lynx is eating $food")
}