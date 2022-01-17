package br.com.mobiletkbrazil.data.di

import br.com.mobiletkbrazil.data.AndroidJobsRepositoryImpl
import br.com.mobiletkbrazil.data.remote.source.RemoteDataSource
import br.com.mobiletkbrazil.data.remote.source.RemoteDataSourceImpl
import br.com.mobiletkbrazil.domain.repository.AndroidJobsRepository
import org.koin.dsl.module.module

val repositoryModule = module {
    factory<AndroidJobsRepository> {
        AndroidJobsRepositoryImpl(
            jobsCacheDataSource = get(),
            remoteDataSource = get()
        )
    }
}

val dataModules = listOf(remoteDataSourceModule, repositoryModule, cacheDataModule)