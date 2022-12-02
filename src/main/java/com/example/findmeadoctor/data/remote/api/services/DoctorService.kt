package com.example.findmeadoctor.data.remote.api.services

import com.example.findmeadoctor.data.remote.dto.DoctorDto
import retrofit2.http.GET


interface DoctorService {

    @GET("doctors")
    suspend fun getDoctors(): List<DoctorDto>

}