package za.co.addcolour.creditscore.di.module

import org.koin.dsl.module
import za.co.addcolour.creditscore.data.repository.MainRepository

val repoModule = module {
    single { MainRepository(get()) }
}