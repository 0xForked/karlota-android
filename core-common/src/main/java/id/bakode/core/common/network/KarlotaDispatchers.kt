package id.bakode.core.common.network

import kotlin.annotation.AnnotationRetention.RUNTIME

@Retention(RUNTIME)
annotation class Dispatcher(val niaDispatcher: NiaDispatchers)

enum class NiaDispatchers {
    IO
}
