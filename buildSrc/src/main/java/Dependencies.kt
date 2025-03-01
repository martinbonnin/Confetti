
object Versions {
    const val kotlinVersion = "1.6.10"
    const val apollo = "3.0.0"

    const val kotlinCoroutines = "1.6.0-RC"

    const val compose = "1.1.0-rc01"
    const val composeCompiler = "1.1.0-rc02"
    const val navCompose = "2.4.0-rc01"
    const val accompanist = "0.21.0-beta"


    const val koin = "3.1.4"
    const val junit = "4.13"
}


object AndroidSdk {
    const val min = 21
    const val compile = 31
    const val target = compile
}

object Apollo {
    const val apolloRuntime = "com.apollographql.apollo3:apollo-runtime:${Versions.apollo}"
    const val apolloNormalizedCache = "com.apollographql.apollo3:apollo-normalized-cache:${Versions.apollo}"
}

object Compose {
    const val compiler = "androidx.compose.compiler:compiler:${Versions.composeCompiler}"
    const val ui = "androidx.compose.ui:ui:${Versions.compose}"
    const val runtime = "androidx.compose.runtime:runtime:${Versions.compose}"
    const val uiGraphics = "androidx.compose.ui:ui-graphics:${Versions.compose}"
    const val uiTooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"
    const val foundationLayout = "androidx.compose.foundation:foundation-layout:${Versions.compose}"
    const val material = "androidx.compose.material:material:${Versions.compose}"
    const val navigation = "androidx.navigation:navigation-compose:${Versions.navCompose}"
    const val coilCompose = "io.coil-kt:coil-compose:1.3.1"
}

object Koin {
    val core = "io.insert-koin:koin-core:${Versions.koin}"
    val test = "io.insert-koin:koin-test:${Versions.koin}"
    val android = "io.insert-koin:koin-android:${Versions.koin}"
    val compose = "io.insert-koin:koin-androidx-compose:${Versions.koin}"
}



