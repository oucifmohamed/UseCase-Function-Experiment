package presenter

import usecase.FetchClientsUseCase

class Presenter(
    private val useCase: FetchClientsUseCase
) {

    fun fetchClients(): List<String> = useCase()
}