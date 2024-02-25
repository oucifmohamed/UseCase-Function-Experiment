package usecase

import repository.Repository

typealias FetchClientsUseCase = () -> List<String>
fun fetchClientsUseCase(
    repository: Repository
): List<String> = repository.fetchClients()