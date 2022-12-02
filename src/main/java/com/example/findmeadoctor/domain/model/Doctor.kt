package com.example.findmeadoctor.domain.model

data class Doctor(
    val id: Int,
    val name: String,
    val speciality: String,
    val rating: Double,
    val num_reviews: Int
)
