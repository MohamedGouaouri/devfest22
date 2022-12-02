package com.example.findmeadoctor.data.repository

import com.example.findmeadoctor.domain.model.Doctor

interface DoctorRepository {
    suspend fun getDoctors(): List<Doctor>
}