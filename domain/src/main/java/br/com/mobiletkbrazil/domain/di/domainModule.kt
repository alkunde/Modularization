package br.com.mobiletkbrazil.domain.di

import br.com.mobiletkbrazil.domain.usecases.GetJobsUseCases
import io.reactivex.schedulers.Schedulers
import org.koin.dsl.module.module

val useCaseModule = module {

    factory {
        GetJobsUseCases(
            repository = get(),
            scheduler = Schedulers.io()
        )
    }
}

val domainModule = listOf(useCaseModule)