package id.bakode.karlota.utils.resources

enum class DataState {
    SUCCESS,
    ERROR,
    LOADING
}

sealed class DataResult<out R> {
    data class Success<out T>(
        val data: T,
        val state: DataState = DataState.SUCCESS
    ) : DataResult<T>()

    data class Error(
        val exception: Exception,
        val state: DataState = DataState.ERROR
    ) : DataResult<Nothing>()

    data class Loading<out T>(
        val state: DataState = DataState.LOADING
    ) : DataResult<T>()
}