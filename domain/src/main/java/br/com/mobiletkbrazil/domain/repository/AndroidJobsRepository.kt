package br.com.mobiletkbrazil.domain.repository

import br.com.mobiletkbrazil.domain.entities.AndroidJob
import io.reactivex.Single

interface AndroidJobsRepository {
    fun getJobs(forceUpdate: Boolean): Single<List<AndroidJob>>
}