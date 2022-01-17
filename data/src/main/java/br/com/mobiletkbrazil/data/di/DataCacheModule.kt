package br.com.mobiletkbrazil.data.di

import br.com.mobiletkbrazil.data.local.database.JobsDatabase
import br.com.mobiletkbrazil.data.local.source.JobsCacheDataSource
import br.com.mobiletkbrazil.data.local.source.JobsCacheSourceImpl
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module.module

val cacheDataModule = module {
    single { JobsDatabase.createDatabase(androidContext()) }
    factory<JobsCacheDataSource> { JobsCacheSourceImpl(jobsDao = get()) }
}