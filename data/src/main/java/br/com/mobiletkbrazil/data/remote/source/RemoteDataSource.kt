package br.com.mobiletkbrazil.data.remote.source

import br.com.mobiletkbrazil.domain.entities.AndroidJob
import io.reactivex.Single

interface RemoteDataSource {
    fun getJobs(): Single<List<AndroidJob>>
}