class Cheetah: Feline() {
    override val image = "cheetah.png"
    override val food = "gazelles"
    override val habitat = "plains"

    override fun makeNoise() = println("Yow!")

    override fun eat() = println("The cheetah is eating $food")
}