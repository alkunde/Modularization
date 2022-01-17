package br.com.mobiletkbrazil.data.local.source

import br.com.mobiletkbrazil.domain.entities.AndroidJob
import io.reactivex.Single

interface JobsCacheDataSource {
    fun getJobs(): Single<List<AndroidJob>>

    fun insertData(list: List<AndroidJob>)
    fun updateData(list: List<AndroidJob>)
}