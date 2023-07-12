sealed class User2(open val id: String) {
    data class Email(override val id: String, val password: String) : User2(id)
    data class Facebook(override val id: String, val email: String, val password: String) : User2(id)
    data class Google(override val id: String, val email: String, val password: String) : User2(id)
}

fun main (args:Array<String>){

    when(User2){

        is Email -> println("User Email: ${User2})
        is Facebook -> println("User Facebook: ${User2} )
        is Google -> println("User Google: ${User2} )
    }
}