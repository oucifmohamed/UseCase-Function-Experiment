package presenter

class Presenter(private val fetchClients: () -> List<String>) {

    fun getClients(): List<String> = fetchClients()
}