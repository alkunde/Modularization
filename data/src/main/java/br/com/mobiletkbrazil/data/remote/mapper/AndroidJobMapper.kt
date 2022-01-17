package br.com.mobiletkbrazil.data.remote.mapper

import br.com.mobiletkbrazil.data.remote.model.AndroidJobPayload
import br.com.mobiletkbrazil.data.remote.model.JobsPayload
import br.com.mobiletkbrazil.domain.entities.AndroidJob

object AndroidJobMapper {

    fun map(payload: JobsPayload) = payload.jobsPayload.map { map(it) }

    private fun map(payload: AndroidJobPayload) = AndroidJob(
        title = payload.title,
        experienceTimeRequired = payload.requiredExperienceYears,
        native = payload.native,
        country = payload.country
    )
}