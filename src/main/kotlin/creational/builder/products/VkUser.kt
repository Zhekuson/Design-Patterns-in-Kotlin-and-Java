package main.kotlin.creational.builder.products

class VkUser(var id:Int){
    lateinit var name: String
    lateinit var surName: String
    lateinit var lastName: String
    lateinit var nickName: String
    lateinit var vkPayid:String
    override fun toString(): String {
        return "VK USER $name $surName $lastName $nickName  VKPAY = $vkPayid ID = $id"
    }
}