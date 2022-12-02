package com.example.findmeadoctor.data.remote.dto

data class DoctorDto(
    val id: Int,
    val name: String,
    val speciality: String,
    val rating: Double,
    val num_reviews: Int
)
