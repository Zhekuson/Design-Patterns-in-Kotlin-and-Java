package main.kotlin.creational.builder

interface UserBuilder {
    fun setName(name: String)
    fun setSurName(surName: String)
    fun setLastName(lastName:String)
    fun setNickName(nickName:String)

}