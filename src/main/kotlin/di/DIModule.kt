package di

import presenter.Presenter
import repository.Repository
import usecase.FetchClientsUseCase
import usecase.fetchClientsUseCase

fun getPresenter(): Presenter {
    return Presenter(getUseCase())
}

fun getUseCase(): FetchClientsUseCase {
    return {
        fetchClientsUseCase(getRepository())
    }
}

fun getRepository(): Repository {
    return Repository()
}