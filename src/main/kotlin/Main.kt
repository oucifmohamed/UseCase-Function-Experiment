import di.getPresenter

fun main(args: Array<String>) {

    val presenter = getPresenter()
    val result = presenter.fetchClients()

    println(result)
}