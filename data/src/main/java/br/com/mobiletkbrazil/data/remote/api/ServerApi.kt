package br.com.mobiletkbrazil.data.remote.api

import br.com.mobiletkbrazil.data.remote.model.JobsPayload
import io.reactivex.Single
import retrofit2.http.GET

interface ServerApi {

    @GET("/android-jobs")
    fun fetchJobs(): Single<JobsPayload>
}