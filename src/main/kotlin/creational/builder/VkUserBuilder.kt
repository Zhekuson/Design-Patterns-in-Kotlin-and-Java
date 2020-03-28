package main.kotlin.creational.builder

import main.kotlin.creational.builder.products.VkUser

class VkUserBuilder:UserBuilder {
    private var user: VkUser = VkUser(0)
    override fun setName(name: String) {
        println("Vk builder is working")
        user.name = name
    }

    override fun setSurName(surName: String) {
        println("Vk builder is working")
        user.surName = surName
    }

    override fun setLastName(lastName: String) {
        println("Vk builder is working")
        user.lastName = lastName
    }

    override fun setNickName(nickName: String) {
        println("Vk builder is working")
        user.nickName = nickName
    }
    fun setId(id:Int){
        println("Vk builder is working")
        user.id = id
    }
    fun setVkPayId(vkPayId:String){
        println("Vk builder is working")
        user.vkPayid = vkPayId
    }
    fun resetAll(){
        println("Only by destroying our past we can build future")
        user = VkUser(0)
    }
    fun getUser(): VkUser {
        println("Vk builder has done his work")
        return user
    }
}