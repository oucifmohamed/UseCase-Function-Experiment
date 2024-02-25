package usecase

import repository.Repository

fun fetchClientsUseCase(repository: Repository): List<String> = repository.fetchClients()