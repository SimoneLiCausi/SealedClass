import com.sun.jdi.connect.Connector.SelectedArgument

//Scrivere una classe sigillata per un tipo Utente che utilizza classi di dati per tipi diversi:
// Email, Facebook, Google. Devono avere ciascuno un ID e, facoltativamente, una password o un'e-mail.
// Utilizzarli in un when all'interno di un metodo per restituire un valore stampabile come String.


sealed class Utente {
    abstract val id: String

    data class Email(
        override val id: String,
        val email: String,
        val password: String
    ) : Utente()

    data class Facebook(
        override val id: String,
        val email: String,
        val password: String
    ) : Utente()

    data class Google(
        override val id: String,
        val email: String,
        val password: String
    ) : Utente()

    fun printUtente(): String {
        return when (this) {
            is Email -> "Email Utente: id = $id, email = $email, password = $password"
            is Facebook -> "Facebook Utente: id = $id, email = $email, password = $password"
            is Google -> "Google Utente: id = $id, email = $email, password = $password"

        }
    }
}






