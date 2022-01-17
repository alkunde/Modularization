package br.com.mobiletkbrazil.data.local.mapper

import br.com.mobiletkbrazil.data.local.model.AndroidJobCache
import br.com.mobiletkbrazil.domain.entities.AndroidJob

object AndroidJobCacheMapper {

    fun map(cacheData: List<AndroidJobCache>) = cacheData.map { map(it) }

    private fun map(cacheData: AndroidJobCache) = AndroidJob(
        title = cacheData.title,
        experienceTimeRequired = cacheData.requireExperienceYears,
        native = cacheData.native,
        country = cacheData.country
    )

    fun mapJobsToCache(jobs: List<AndroidJob>) = jobs.map { map(it) }

    private fun map(data: AndroidJob) = AndroidJobCache(
        title = data.title,
        requireExperienceYears = data.experienceTimeRequired,
        native = data.native,
        country = data.country
    )
}