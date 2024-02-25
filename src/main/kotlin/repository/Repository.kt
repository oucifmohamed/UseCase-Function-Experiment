package repository

class Repository {

    private val clients = listOf("Person1", "Person2", "Person3")

    fun fetchClients(): List<String> = clients
}