package di

import presenter.Presenter
import repository.Repository
import usecase.fetchClientsUseCase

fun getPresenter(): Presenter {
    return Presenter(getUseCase())
}

fun getUseCase(): () -> List<String> {
    return {
        fetchClientsUseCase(getRepository())
    }
}

fun getRepository(): Repository {
    return Repository();
}