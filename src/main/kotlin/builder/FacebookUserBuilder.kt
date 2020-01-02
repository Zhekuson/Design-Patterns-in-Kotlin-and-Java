package main.kotlin.builder

import main.kotlin.builder.products.FacebookUser

class FacebookUserBuilder:UserBuilder {
    private var user:FacebookUser = FacebookUser(0)
    override fun setName(name: String) {
        println("FB builder is working")
        user.name = name
    }

    override fun setSurName(surName: String) {
        println("FB builder is working")
        user.surName = surName
    }

    override fun setLastName(lastName: String) {
        println("FB builder is working")
        user.lastName = lastName
    }

    override fun setNickName(nickName: String) {
        println("FB builder is working")
        user.nickName = nickName
    }
    fun setId(id:Int){
        println("FB builder is working")
        user.id = id
    }
    fun resetAll(){
        println("Only by destroying our past we can build future - Facebook")
        user = FacebookUser(0)
    }
    fun getUser():FacebookUser{
        return user
    }
}