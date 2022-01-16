package br.com.mobiletkbrazil.domain.entities

data class AndroidJob(
    val title: String,
    val experienceTimeRequired: Int,
    val native: Boolean,
    val country: String
)