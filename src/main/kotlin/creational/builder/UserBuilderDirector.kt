package main.kotlin.creational.builder

import main.kotlin.creational.builder.products.FacebookUser
import main.kotlin.creational.builder.products.VkUser

class UserBuilderDirector {
    fun makeFacebookUser(builder:FacebookUserBuilder ):FacebookUser{
        builder.setId(0)
        builder.setLastName("last name")
        builder.setName("NAAME")
        builder.setNickName("AeroOne")
        builder.setSurName("SurName")
        return builder.getUser()
    }
    fun makeVkUser(builder:VkUserBuilder):VkUser{
        builder.setId(0)
        builder.setLastName("last name")
        builder.setName("NAAME")
        builder.setNickName("AeroOne Vk")
        builder.setSurName("SurName")
        builder.setVkPayId("VK PAY ISSSS")
        return builder.getUser()
    }

}