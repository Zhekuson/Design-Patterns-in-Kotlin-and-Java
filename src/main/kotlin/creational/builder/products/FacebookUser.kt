package main.kotlin.creational.builder.products

class FacebookUser(var id:Int) :User {
    lateinit var name: String
    lateinit var surName: String
    lateinit var lastName: String
    lateinit var nickName: String
    override fun toString(): String {
        return "FB USER $name $surName $lastName $nickName ID = $id"
    }
}