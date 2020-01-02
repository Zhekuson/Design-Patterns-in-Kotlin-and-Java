package main.kotlin.builder

fun main() {
    val director = UserBuilderDirector()
    val vkUserBuilder = VkUserBuilder()
    val facebookUserBuilder = FacebookUserBuilder()

    println(director.makeFacebookUser(facebookUserBuilder))
    println(director.makeVkUser(vkUserBuilder))
    println()
    println("The last built user")
    println(vkUserBuilder.getUser())
}