package br.com.mobiletkbrazil.domain.repository

import br.com.mobiletkbrazil.domain.entities.AndroidJob
import io.reactivex.Observable

interface AndroidJobsRepository {
    fun getJobs(forceUpdate: Boolean): Observable<List<AndroidJob>>
}